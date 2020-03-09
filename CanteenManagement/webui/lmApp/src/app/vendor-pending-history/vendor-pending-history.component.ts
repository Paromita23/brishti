import { Component, OnInit } from '@angular/core';
import { VendorService } from '../vendor.service';
import { Observable} from 'rxjs';
import 'rxjs/add/observable/of';
import {Router,ActivatedRoute} from '@angular/router';
import { Vendor } from '../vendor';

@Component({
  selector: 'app-vendor-pending-history',
  templateUrl: './vendor-pending-history.component.html',
  styleUrls: ['./vendor-pending-history.component.css']
})
export class VendorPendingHistoryComponent implements OnInit {
  
  vendorName : string;
  venId : number;
  vendor : Vendor;
  orders : Observable<Vendor[]>;
  selValue : number;
  values : string;
  filter : string[];
  feature = 'Feature 1'
  arr : [];
  rs : string;
  status : string;
  selectedFeatures: any = [];
  AcceptorReject(orderId,ventId){
    localStorage.setItem("aororderId",orderId);
    localStorage.setItem("aorcustId",ventId);
    this._router.navigate(['../accept or reject'], {relativeTo: this._route});
    //this._router.navigate(['../acceptreject'], {relativeTo: this._route});
  }
  constructor(private vendorService : VendorService,private _router :Router,private _route :ActivatedRoute) { 
    this.vendor = localStorage.getItem('vendor')? JSON.parse(localStorage.getItem('vendor')):[];
    // alert("Customer Id is " +this.customer.cusId);
    this.orders=this.vendorService.showpendingVendorOrders(this.vendor.vendorId);
  
  }
  checkIfAllSelected(x) {
    this.selectedFeatures.push(x);
    // alert("added");
  }
  AcceptMe() {
    this.values = this.selectedFeatures.toString();
    // alert(this.values);
    this.filter = this.values.split(",");
    this.status="ACCEPTED";
    for(var v=0;v<this.filter.length;v++) {
      alert(this.filter[v]);
      this.vendorService.AcceptedorRejeted(parseInt(this.filter[v]),this.vendor.vendorId,this.status).subscribe(x => {
        this.rs=x;
      })
    }
    alert("Selected Orders Accepted Successfully...");
    this._router.navigate(['/vendordashboard']);
    // alert(this.customer.customerId);

  }

  ngOnInit() {
  }

}

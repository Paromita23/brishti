import { Component, OnInit } from '@angular/core';
import { VendorService } from '../vendor.service';
import { Observable} from 'rxjs';
import 'rxjs/add/observable/of';
import {Router} from '@angular/router';
import { Vendor } from '../vendor';

@Component({
  selector: 'app-vendor-order-history',
  templateUrl: './vendor-order-history.component.html',
  styleUrls: ['./vendor-order-history.component.css']
})
export class VendorOrderHistoryComponent implements OnInit {

  vendorName : string;
  venId : number;
  vendor : Vendor;
  orders : Observable<Vendor[]>;
  constructor(private vendorService : VendorService) {
    this.vendor = localStorage.getItem('vendor')? JSON.parse(localStorage.getItem('vendor')):[];
    // alert("Customer Id is " +this.customer.cusId);
    this.orders=this.vendorService.showVendorHistory(this.vendor.vendorId);
     
 
   }

  ngOnInit() {
  }

}

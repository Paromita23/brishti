import { Component, OnInit } from '@angular/core';
import { CustomerService } from '../customer.service';
import { Observable} from 'rxjs';
import 'rxjs/add/observable/of';
import {Router,ActivatedRoute} from '@angular/router';
import { Customer } from '../customer';

@Component({
  selector: 'app-customer-pending-history',
  templateUrl: './customer-pending-history.component.html',
  styleUrls: ['./customer-pending-history.component.css']
})
export class CustomerPendingHistoryComponent implements OnInit {

  customerName : string;
  custId : number;
  customer : Customer;
  orders : Observable<Customer[]>;
  selValue : number;
  values : string;
  filter : string[];
  feature = 'Feature 1'
  arr : [];
  rs : string;
  status : string;
  selectedFeatures: any = [];
  
 

  constructor(private customerService : CustomerService ,private _router :Router,private _route :ActivatedRoute) {
    this.customer = localStorage.getItem('customer')? JSON.parse(localStorage.getItem('customer')):[];
  this.orders=this.customerService.showpendingCustomerOrders(this.customer.customerId);
  }
    cancelorder(orderId,custId){
      localStorage.setItem("cancelorderId",orderId);
      localStorage.setItem("cancelcustId",custId);
      this._router.navigate(['../cancelorder'], {relativeTo: this._route});
    }
    checkIfAllSelected(x) {
      this.selectedFeatures.push(x);
      // alert("added");
    }
    cancelMe() {
      this.values = this.selectedFeatures.toString();
      // alert(this.values);
      this.filter = this.values.split(",");
      this.status="YES";
      for(var v=0;v<this.filter.length;v++) {
        alert(this.filter[v]);
        this.customerService.cancelorder(parseInt(this.filter[v]),this.customer.customerId,this.status).subscribe(x => {
          this.rs=x;
        })
      }
      alert("Selected Orders Cancelled Successfully...");
      this._router.navigate(['/dashBoard']);
      // alert(this.customer.customerId);
  
  
    }

  ngOnInit() {
  }

}
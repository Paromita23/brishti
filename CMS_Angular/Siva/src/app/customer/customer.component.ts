import { Component, OnInit } from '@angular/core';
import { CustomerService } from '../customer.service';
import { Observable} from 'rxjs';
import 'rxjs/add/observable/of';
import {Router} from '@angular/router';
import { Customer } from '../customer';

@Component({
  selector: 'app-customer',
  templateUrl: './customer.component.html',
  styleUrls: ['./customer.component.css']
})
export class CustomerComponent implements OnInit {
  customerName : string;
  custId : number;
  customer : Customer;
  constructor(private customerService : CustomerService) {
    this.customerName = localStorage.getItem("user");
    this.customerService.findByCustomerName(this.customerName).subscribe( x => {
       this.customer=x;
       localStorage.setItem('customer', JSON.stringify(this.customer));
       this.custId=x.customerId;
     },
    err => {
      console.log(err);
    }) 
   }

  ngOnInit() {
    // this.custId=this.customer.cusId;
    // alert(this.custId);
  }
}
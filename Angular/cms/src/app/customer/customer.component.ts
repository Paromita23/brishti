import { Component, OnInit } from '@angular/core';
import { Observable } from 'rxjs';
import {Customer } from '../customer';
import {CustomerService } from '../customer.service';

@Component({
  selector: 'app-customer',
  templateUrl: './customer.component.html',
  styleUrls: ['./customer.component.css']
})
export class CustomerComponent implements OnInit {

  customers : Observable<Customer[]>;
  constructor(private customerService : CustomerService) {
    this.customers=customerService.showCustomer();
  }

  ngOnInit() {
  }

}

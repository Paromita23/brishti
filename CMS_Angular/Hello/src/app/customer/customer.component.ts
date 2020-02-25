import { Component, OnInit } from '@angular/core';
import { Customer } from '../customer';

@Component({
  selector: 'app-customer',
  templateUrl: './customer.component.html',
  styleUrls: ['./customer.component.css']
})
export class CustomerComponent implements OnInit {

  constructor() { }
  customerName : string;
  show(name) {
    this.customerName = name;
  }
  customers = [
    new Customer("MOHAN",1200,"MOHANIPS@GMAIL.COM",9704556474,"30,CHENNAI","MOHAN12","MOHAN101"),
    new Customer("SEETHA",1201,"SEETHA@GMAIL.COM",8796789879,"45,HYDERBAD","SEETHA12","SEETHA102"),
    new Customer("SATHYA",1202,"SATHYA@GMAIL.COM",981212179,"54,CHENNAI","SATHAY12","SATHAY103"),
    new Customer("RAGHAV",1203,"RAGHAV787@GMAIL.COM",9896789879,"31,T-NAGAR","RAGHAV12","RAGHAV104"),
    new Customer("RAMKEY",1204,"RAMK786787@GMAIL.COM",987459879,"21,CMBT","RAMKEY12","RAMKEY105"),
    new Customer("RAGU",1205,"RAGU@GMAIL.COM",8795487879,"34,SIRUSERI","RAGU12","RAGU106"),
  ]

  ngOnInit() {
  }

}

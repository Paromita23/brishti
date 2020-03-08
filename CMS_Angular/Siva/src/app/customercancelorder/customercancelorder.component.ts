import { Component, OnInit } from '@angular/core';
import { CustomerService } from '../customer.service';

@Component({
  selector: 'app-customercancelorder',
  templateUrl: './customercancelorder.component.html',
  styleUrls: ['./customercancelorder.component.css']
})
export class CustomercancelorderComponent implements OnInit {

  customerId : number;
  orderId : number;
  status : string;
  result : string;
  constructor(private _customerService : CustomerService) { 
    this.orderId=parseInt(localStorage.getItem("cancelOrderId"));
    this.customerId=parseInt(localStorage.getItem("cancelCustId"));
  }

  cancel() { 
    // alert(this.orderId);
    // alert(this.customerId);
    // alert(this.status);
    this._customerService.cancelorder(this.orderId,this.customerId,this.status).subscribe(x => {
      this.result=x;
    })
  }

  ngOnInit() {
  }

}


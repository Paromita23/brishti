import { Component, OnInit } from '@angular/core';
import { CustomerService } from '../customer.service';

@Component({
  selector: 'app-cancelorder',
  templateUrl: './cancelorder.component.html',
  styleUrls: ['./cancelorder.component.css']
})
export class CancelorderComponent implements OnInit {

  customerId : number;
  orderId : number;
  status : string;
  result : string;
  constructor(private _customerService : CustomerService ) { }
  cancel() {
    this._customerService.cancelorder(this.orderId, this.customerId, this.status).subscribe(x => {
      this.result = x;
  })
}

  ngOnInit() {
  }

}

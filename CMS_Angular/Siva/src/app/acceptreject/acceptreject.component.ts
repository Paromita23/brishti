import { Component, OnInit } from '@angular/core';
import { VendorService } from '../vendor.service';

@Component({
  selector: 'app-acceptreject',
  templateUrl: './acceptreject.component.html',
  styleUrls: ['./acceptreject.component.css']
})
export class AcceptrejectComponent implements OnInit {
  vendorId : number;
  orderId : number;
  status : string;
  result : string;

  constructor(private _vendorService : VendorService) { }
  AcceptedorRejeted(){
  this._vendorService.AcceptedorRejeted(this.orderId,this.vendorId,this.status).
  subscribe(x => {
  this.result=x;
  })
}
  ngOnInit() {
  }

}

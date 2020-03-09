import { Component, OnInit } from '@angular/core';
import { Orders } from '../orders';
import { Menu } from '../menu';
import { Vendor } from '../vendor';
import { Wallet } from '../wallet';
import { MenuService } from '../menu.service';
import { VendorService } from '../vendor.service';
import { WalletService } from '../wallet.service';
import { CustomerService } from '../customer.service';
import { Customer } from '../customer';

@Component({
  selector: 'app-qr-code',
  templateUrl: './qr-code.component.html',
  styleUrls: ['./qr-code.component.css']
})
export class QrCodeComponent implements OnInit {
  public myAngularxQrCode: string = null;
  vendId: number;
  orderId: number;
  result: Customer[];
  order : Orders;

  constructor(private _customerService : CustomerService) { 
    this.order = localStorage.getItem('billData')? JSON.parse(localStorage.getItem('billData')):[];
    alert(this.order.customerId);
    alert(this.order.orderTotalamount);
    alert(this.order.orderQuantity);
    alert(this.order.menuId);

    this.myAngularxQrCode = '== Bill == '+'\n Your Customer Id is : ' +this.order.customerId +"\n Your Menu ID is : "+this.order.menuId+'\n Quantity : ' +this.order.orderQuantity+'\n Thanks for your Order';
  }
  qrCode(){

    this.model.menuId=parseInt(this.menu.menuCat);
    this.model.vendorId=parseInt(this.vendor.vendorName);
    this.model.walletType = this.wallet.walletType;
    this._customerService.placeOrder(this.model).subscribe(x => {
      this.myAngularxQrCode = x;
    this.vendId=parseInt(localStorage.getItem("vendId"));
    this.orderId=parseInt(localStorage.getItem("orderId"));
    })
    // this.myAngularxQrCode = 'Your QR code data string';
   }
   displayqr() {
    this._customerService.showpendingCustomerOrders(this.vendId).subscribe(x => {
      this.result=x;
    })
  }
  model = new Orders();
  menu = new Menu();
  vendor = new Vendor();
  wallet = new Wallet();
  ngOnInit() {
  }

}
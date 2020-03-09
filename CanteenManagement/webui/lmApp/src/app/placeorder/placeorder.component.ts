import { Component, OnInit } from '@angular/core';
//import { Router } from '@angular/router';
import { Observable } from 'rxjs';
import { Customer } from '../customer';
import { CustomerService } from '../customer.service';
import { Menu } from '../menu';
import { MenuService } from '../menu.service';
import { Orders } from '../orders';
import { Vendor } from '../vendor';
import { VendorService } from '../vendor.service';
import { Wallet } from '../wallet';
import { WalletService } from '../wallet.service';
import { Router, ActivatedRoute } from '@angular/router';

@Component({
  selector: 'app-placeorder',
  templateUrl: './placeorder.component.html',
  styleUrls: ['./placeorder.component.css']
})
export class PlaceorderComponent implements OnInit {
  customer : Customer;
  menuList : Observable<Menu[]>;
  vendorList : Observable<Vendor[]>;
  walletList : Observable<Wallet[]>;
  result : string;
  menuFound : Menu;
  //model : Customer;
  //menu : Menu;
  price : number;
  constructor(private _menuService : MenuService, private _vendorService : VendorService, private _walletService : WalletService, private _customerService : CustomerService ,private _router : Router ,private _route : ActivatedRoute) {
    this.customer = localStorage.getItem('customer')? JSON.parse(localStorage.getItem('customer')):[];
    this.model.customerId=this.customer.customerId;
    this.menuList = _menuService.showMenu();
    this.vendorList = _vendorService.showVendor();
    this.walletList=_walletService.showByWallet(this.customer.customerId);
    //this.walletList=_walletService.showByWallet(this.customer.customerId);
   this.menu.menuItem="Dosa";
   }
   showAmount() {
    //  alert("Hi");
    // alert(this.menu.menName);
    let menuId : number;
    menuId=parseInt(this.menu.menuItem);
    this._menuService.searchMenu(menuId).subscribe(x => {
      this.menuFound = x;
      this.price=x.menuCost;
    });
    // this.price = this.menuFound.menPrice;
   }
  placeOrder() {
    
    alert(this.model.customerId);
    alert(this.menu.menuItem);
    alert(this.vendor.vendorName);
    alert(this.menuFound.menuCost);
    this.model.menuId=parseInt(this.menu.menuItem);
    this.model.vendorId=parseInt(this.vendor.vendorName);
    this.model.walletType = this.wallet.walletType;
    this._customerService.placeOrder(this.model).subscribe(x => {
      this.result = x;alert("vbasdi");
    })
   }
   qrGenerate() {
    localStorage.setItem('billData', JSON.stringify(this.model));
    this._router.navigate(['../qrComponent'], {relativeTo: this._route});
   }
  model = new Orders();
  menu = new Menu();
  vendor = new Vendor();
  wallet = new Wallet();
  ngOnInit() {
  }

}

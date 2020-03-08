import { Component, OnInit } from '@angular/core';
import { Orders } from '../orders';
import { Customer } from '../customer';
import { Menu } from '../menu';
import { Observable } from 'rxjs';
import { MenuService } from '../menu.service';
import { Vendor } from '../vendor';
import { VendorService } from '../vendor.service';
import { Wallet } from '../wallet';
import { WalletService } from '../wallet.service';
import { CustomerService } from '../customer.service';


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
  constructor(private _menuService : MenuService, private _vendorService : VendorService, private _walletService : WalletService, private _customerService : CustomerService) {
    this.customer = localStorage.getItem('customer')? JSON.parse(localStorage.getItem('customer')):[];
    this.model.customerId=this.customer.customerId;
    this.menuList = _menuService.showMenu();
    this.vendorList = _vendorService.showVendor();
    this.walletList=_walletService.showByWallet(this.customer.customerId);
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
      this.result = x;
    })
   }
  model = new Orders();
  menu = new Menu();
  vendor = new Vendor();
  wallet = new Wallet();
  ngOnInit() {
  }

}

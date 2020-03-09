import { Component, OnInit } from '@angular/core';
import { Observable } from 'rxjs';
import { Wallet } from '../wallet';
import { WalletService } from '../wallet.service';
import { Customer } from '../customer';


@Component({
  selector: 'app-wallet',
  templateUrl: './wallet.component.html',
  styleUrls: ['./wallet.component.css']
})
export class WalletComponent implements OnInit {
  wallet : Observable<Wallet[]>
  //wallet1 : Observable<Wallet[]>
  customer : Customer;
  show() {
    
  }

  constructor(private walletService : WalletService) { 
    this.customer = localStorage.getItem('customer')? JSON.parse(localStorage.getItem('customer')):[];
    //this.wallet=walletService.showWallet();
    this.wallet=walletService.showByWallet(this.customer.customerId);
  }

 


  ngOnInit() {
  }

}


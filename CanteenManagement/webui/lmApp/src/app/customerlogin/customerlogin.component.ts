import { Component, OnInit } from '@angular/core';
import { CustomerService } from '../customer.service';
import { Observable} from 'rxjs';
import 'rxjs/add/observable/of';
import {Router} from '@angular/router';
import { Customer } from '../customer';

@Component({
  selector: 'app-customerlogin',
  templateUrl: './customerlogin.component.html',
  styleUrls: ['./customerlogin.component.css']
})
export class CustomerloginComponent implements OnInit {
  result : any = {res:''};
  test : string;
  custId : number;
  userName : string;
  passWord : string;
  customer : Observable<Customer>;
  count : number;

  validate()  {
    this.customerService.validateCustomer(this.userName,this.passWord).subscribe( x => {
    if(x=="1") {
      localStorage.setItem("user",this.userName);
      this.router.navigate(["/dashBoard"]);
    } else {
      this.count++;
    }
   console.log("result " +x);
   },
  err => {
    console.log(err);
  })
}
  constructor(private customerService : CustomerService, private router : Router) { 
    this.count=0;

  }

  ngOnInit() {
    this.validate();
  }

}
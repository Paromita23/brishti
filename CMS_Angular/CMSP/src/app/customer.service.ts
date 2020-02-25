import { Injectable } from '@angular/core';
import { Http, Response } from '@angular/http';
import {Observable} from 'rxjs';
import { Customer } from './customer';
import 'rxjs/add/operator/map';
import { Orders } from './orders';

@Injectable({
  providedIn: 'root'
})
export class CustomerService {
  [x: string]: any;
  
  constructor(private http :Http) { }
  validateCustomer(user : string, pwd : string) : Observable<string> {
    return this.
    http.get("http://localhost:8080/MLP178-0.0.1-SNAPSHOT/api/Customer/"+user+"/"+pwd).
    map((res : Response) => res.text());
  }

  findByCustomerName(user : string) : Observable<Customer> {
    return this.
    http.get("http://localhost:8080/MLP178-0.0.1-SNAPSHOT/api/Customer/"+user).
    map((res : Response) => res.json());
  }
  orderHistory(custId : number) : Observable<Customer[]> {
    return this.
    http.get("http://localhost:8080/MLP178-0.0.1-SNAPSHOT/api/Orders/"+custId).
    map((res : Response) => res.json());
  }
  showpendingCustomerOrders(custId : number) : Observable<Customer[]> {
    return this.
    http.get("http://localhost:8080/MLP178-0.0.1-SNAPSHOT/api/Orders/pendingcus/"+custId).
    map((res : Response) => res.json());
    
  }
}

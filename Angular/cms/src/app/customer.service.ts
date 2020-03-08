import { Injectable } from '@angular/core';
import { Http, Response } from '@angular/http';
import { Observable } from 'rxjs';
import { Customer } from './customer';
import './rxjs/add/operator/map';

@Injectable({
  providedIn: 'root'
})
export class CustomerService {

  constructor(private http : Http) { }
  showCustomer() : Observable<Customer[]> {
    return this.
    http.get("http://localhost:8080/MLP178-0.0.1-SNAPSHOT/api/Customer").
    map((res : Response) => res.json());
  }
}

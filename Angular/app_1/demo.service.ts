import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class DemoService {

  sayHello(): String {
    return "hello world...";
  }

  logout() : string {
    return "Evening 7 Please logout";
  }
  constructor() { }
}

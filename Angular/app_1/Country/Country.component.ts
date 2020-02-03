import { Component, OnInit } from '@angular/core';
import {Country} from '../country';
@Component({
  selector: 'app-country',
  templateUrl: './country.component.html',
  styleUrls: ['./country.component.css']
})
export class CountryComponent implements OnInit {
 countries = [
   new Country(1, 'USA'),
   new Country(2, 'US2A')
 ];
  constructor() { }

  ngOnInit() {
  }

}

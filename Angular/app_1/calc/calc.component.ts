import { Component, OnInit } from '@angular/core';
import { Calc } from '../calc';

@Component({
  selector: 'app-calc',
  templateUrl: './calc.component.html',
  styleUrls: ['./calc.component.css']
})
export class CalcComponent implements OnInit {
 model = new Calc();
 company:string;
  constructor() {
    this.company ="hexaware";
    localStorage.setItem("company",this.company);
   }
sum()
{
  this.model.res=this.model.fno+this.model.sno;
}
sub()
{
  this.model.res=this.model.fno-this.model.sno;
}
mult()
{
  this.model.res=this.model.fno*this.model.sno;
}
  ngOnInit() {
  }

}

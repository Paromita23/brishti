import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-calc',
  templateUrl: './calc.component.html',
  styleUrls: ['./calc.component.css']
})
export class CalcComponent implements OnInit {

  constructor() {}
  firstNo : number;
  secondNo : number;
  sumresult : number;
  minusresult : number;
  multresult : number;
  divresult : number;

  sum() {
    this.sumresult=this.firstNo+this.secondNo;
  }

  minus() {
    this.minusresult=this.firstNo-this.secondNo;
  }

  mult() {
    this.multresult=this.firstNo*this.secondNo;
  }

  div() {
    this.divresult=this.firstNo/this.secondNo;
  }

  ngOnInit() {
  }

}

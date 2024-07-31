import { Component } from '@angular/core';
import { CalculatorService } from '../calculator.service';
import { FactorialService } from '../factorial.service';

@Component({
  selector: 'app-mycomponent',
  templateUrl: './mycomponent.component.html',
  styleUrl: './mycomponent.component.css'
})
export class MycomponentComponent {
  sum :number;
  sub : number;
  n   : number;
  constructor( private calc : CalculatorService,private fact : FactorialService){
    this.sum =calc.getAddition(10,20);
    this.sub =calc.getSubtraction(10,20);
    this.n= fact.getFactorial(7);
}
}

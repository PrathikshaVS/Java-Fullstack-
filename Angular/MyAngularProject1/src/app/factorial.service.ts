import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class FactorialService {
  getFactorial(n: number): number {
    if (n === 0 || n === 1) {
      return 1;
    } else {
      return n * this.getFactorial(n - 1);
    }
  }
}

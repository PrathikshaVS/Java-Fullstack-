import { Component } from '@angular/core';
import { Hobby } from './model/Hobby';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css'] 
})
export class AppComponent {
  title = 'Hobby';
  
  hobby: Hobby;

  constructor() {
    this.hobby = new Hobby(1, 'Reading', 3, ['Fiction', 'Non-Fiction', 'Biography']);
  }

  insertHobby(data: any) {
    this.hobby.hobbyID = data.hobbyID;
    this.hobby.hobbyName = data.hobbyName;
    this.hobby.hobbyNos = data.hobbyNos;
    this.hobby.hobbyList = data.hobbyList;
  }

  saveHobby() {
   
  }

  updateHobby() {
    
  }

  deleteHobby() {
    
  }
  findHobby(){

  }
  findallHobby(){
    
  }
}
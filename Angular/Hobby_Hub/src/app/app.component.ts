import { Component } from '@angular/core';
import { FormGroup, FormControl } from '@angular/forms';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrl: './app.component.css'
})
export class AppComponent {
  title = 'Hobby_Hub';
  
  HobbyForm = new FormGroup({
    id: new FormControl(''),
    name: new FormControl(''),
    salary: new FormControl(''),
    hobbyList: new FormControl('')
  });
  
  saveHobby() {
    console.log(this.HobbyForm.value);
  }

  updateHobby() {
    console.log(this.HobbyForm.value);
  }

  deleteHobby() {
    console.log(this.HobbyForm.value);
  }

  insertHobby() {
    console.log(this.HobbyForm.value);
  }
}

import { Component, OnInit } from '@angular/core';
import { FormControl, Validators, FormGroup, Form, FormBuilder } from '@angular/forms';
import { MatSnackBar } from '@angular/material';
import { ActivatedRoute, Router } from '@angular/router';
import { LoginmodelModule } from '../../model/loginmodel/loginmodel.module';
import { UserService } from '../../service/user.service'

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.scss']
})
export class LoginComponent implements OnInit {

  loginmodel: LoginmodelModule = new LoginmodelModule();
  email = new FormControl('', [Validators.required, Validators.email]);
  password = new FormControl('');
  token: string;

  constructor(
    private snackBar: MatSnackBar,
    private route: ActivatedRoute,
    private userservice:UserService,
    public formBuilder: FormBuilder,
    private router: Router) { }

    ngOnInit() {
    }
  login(){
    let data={
      'emailId':this.email.value,
      'password':this.password.value
    }
    
    this.userservice.postrequest("login", data).subscribe(
      (response:any)=>{
        console.log("response data==>",response);
        localStorage.setItem("token", response.data);
        this.snackBar.open(response.message,'end now',{duration:3000});
        this.router.navigate(['dashboard']);
      },
      error=>{
        console.log("error in login==>",error);
        this.snackBar.open('login Failed','end now ',{duration:3000})
      }
    )
  }
}

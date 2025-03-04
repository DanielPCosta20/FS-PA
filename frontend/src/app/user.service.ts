// src/app/user.service.ts
import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { environment } from 'src/environment/environment';

export interface User {
  id: number;
  name: string;
  email: string;
}

@Injectable({
  providedIn: 'root'
})

export class UserService {
  private apiUrl = environment.apiEndpoint;


  constructor(private http: HttpClient) { }

  getHome() {
    const url = this.apiUrl + "home";
    return this.http.get<any>(url);
  }

  getAllUsers() {
    console.log(this.apiUrl);
    const url = this.apiUrl + "users";
    console.log(url);
    //return this.http.get<any[]>(`${this.apiUrl}home`);
    return this.http.get<any>(url);
  }

  getUserById(id: number) {
    console.log("AQUI 2");
    return this.http.get<User>(`${this.apiUrl}/${id}/get`);
  }

  addUser(user: User) {
    return this.http.post<void>(`${this.apiUrl}/save`, user);
  }

  updateUser(id: number, user: User) {
    return this.http.put<void>(`${this.apiUrl}/${id}/change`, user);
  }

  deleteUser(id: number) {
    return this.http.delete<void>(`${this.apiUrl}/${id}/delete`);
  }
}

import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { environment } from '../environments/environment';

@Injectable({
  providedIn: 'root'
})
export class ApiService {

  private apiUrl = environment.apiUrl;

  constructor(private http: HttpClient) { }

  getUsers(): Observable<any> {
    return this.http.get(`${this.apiUrl}/api/users`);
  }

  addUser(user: any): Observable<any> {
    return this.http.post(`${this.apiUrl}/api/users`, user);
  }

  updateUser(user: any): Observable<any> {
    return this.http.put(`${this.apiUrl}/api/users/${user.id}`, user);
  }

  deleteUser(userId: number): Observable<any> {
    return this.http.delete(`${this.apiUrl}/api/users/${userId}`);
  }

}

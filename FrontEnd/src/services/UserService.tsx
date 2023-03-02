import axios from "axios"

const axiosInstance = axios.create({
  baseURL: 'http://localhost:8080/api',
  timeout: 10000,
  headers: {
    'Content-Type': 'application/json',
  }
})

class UserService {

  getUsers() {
    return axiosInstance.get('/users')
  }
}

export default new UserService();
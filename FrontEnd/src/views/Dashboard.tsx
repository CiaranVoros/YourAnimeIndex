import React, { useEffect, useState } from "react"
import axios from "axios"
import UserService from "../services/UserService"

const Dashboard = () => {
  const [users, setUsers] = useState([])

  useEffect(() => {
    UserService.getUsers()
      .then(res => {
        setUsers(res.data)
      })
      .catch(err => console.log(err))
  }, [])
  return (
    <>
      {
        users.map((user, i) =>
          <p key={i}>{user}</p>
        )
      }
    </>
  )
}

export default Dashboard
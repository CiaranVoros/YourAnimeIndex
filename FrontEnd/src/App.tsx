import { useEffect, useState } from 'react'
import reactLogo from './assets/react.svg'
import './App.css'
import UserService from './services/UserService'

function App() {
	const [users, setUsers] = useState([])

	useEffect(()=>{
		UserService.getUsers()
		.then(res=>{
			setUsers(res.data)
		})
		.catch(err=>console.log(err))
	}, [])

	return (
		<div className="App">
			{
				users.map((user, i) => 
				<p key={i}>{user}</p>
				)
			}
		</div>
	)
}

export default App

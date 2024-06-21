import React from 'react'
import AccountCircleIcon from "@mui/icons-material/AccountCircle"
import { Button } from '@mui/material'
import { useNavigate } from 'react-router-dom'


const Logout = () => {
    const navigate=useNavigate("/");
    const handleLogout=()=>{
      navigate("/")
    }
  return (
    <div className='min-h-[80vh] flex flex-col justify-center items-center'>
                   <div className='flex flex-col items-center justify-center'>
                    <AccountCircleIcon sx={{fontSize:"9rem"}}/>
                    <h1 className='py-5 text-2xl font-semibold'>Code with Jayanth</h1>
                    <p>Email: jayanthgummitha@gmail.com</p>
                    <Button  variant="contained" onClick={handleLogout} sx={{margin: "2rem 0rem"}}>
                        Logout
                    </Button>
                   </div>
    </div>
  )
}

export default Logout
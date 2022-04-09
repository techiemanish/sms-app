import React from 'react'
import { Link, useLocation } from 'react-router-dom'
import Login from '../components/Login';
import { useState } from 'react';
import StaffNavBar from './StaffNavBar';

function RegisteredStaff(props) {
    const [alert, setAlert] = useState(null);
    const showAlert =(message, type)=>{
        setAlert({
          msg: message,
          type: type
        });
        setTimeout(()=>{
          setAlert(null);
        },1500);
    }
      const location = useLocation();
      console.log(location.state)
      const print = () =>{
          window.print();
      }
      if(location.state != null){
          return ( 
              <>
              <StaffNavBar/>
              <div className="container text-success w-75 p-5 rounded-3" style={{marginTop:"20px",border:"2px solid #f1f1f1"}}>
                  <center><u><h2>Staff Details</h2></u></center>
                  <h4 className="text-primary">Registration Id: <b className="text-success">{location.state.registrationId}</b></h4>
                  <h4 className="text-primary">Full Name: <b className="text-success">{location.state.name}</b></h4>
                  <h4 className="text-primary">Father Name: <b className="text-success">{location.state.fatherName}</b></h4>
                  <h4 className="text-primary">Mother Name: <b className="text-success">{location.state.motherName}</b></h4>
                  <h4 className="text-primary">Contact: <b className="text-success">{location.state.contact}</b></h4>
                  <h4 className="text-primary">Email: <b className="text-success">{location.state.email}</b></h4>
                  <h4 className="text-primary">Gender: <b className="text-success">{location.state.gender}</b></h4>
                  <h4 className="text-primary">Address: <b className="text-success">{location.state.address}</b></h4>
                  <h4 className="text-primary">City: <b className="text-success">{location.state.city}</b></h4>
                  <h4 className="text-primary">Qualification: <b className="text-success">{location.state.qualification}</b></h4>
                  <h4 className="text-primary">Experience: <b className="text-success">{location.state.experience}</b></h4>
                  <h4 className="text-primary">Emergency Contact Number: <b className="text-success">{location.state.emergency}</b></h4>
              </div>
              <center style={{marginBottom: '100px'}} >
                  <button className='nav-link w-25 text-light bg-success mt-3' onClick={print} style={{border:"2px solid green",padding:"15px"}}>Print</button>
                  <Link to="/staffs/register" className='nav-link text-light bg-success w-25 mt-3' style={{marginBottom: '100px',border:"2px solid green",padding:"15px"}}>New Staff Registration</Link>
              </center>
              </>
            )
      }
      else{
          return(
            <>
            <Login heading="Admin Login" showAlert={showAlert}/>
            </>
          )
          
      }
    
}

export default RegisteredStaff
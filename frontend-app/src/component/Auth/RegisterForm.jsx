import {
  Button,
  FormControl,
  InputLabel,
  MenuItem,
  Select,
  TextField,
  Typography,
} from "@mui/material";
import { Field, Form, Formik } from "formik";
import React from "react";
import { useNavigate } from "react-router-dom";

const initialValues = {
  fullName: "",
  email: "",
  password: "",
  role: "",
};
const RegisterForm = () => {
  const navigate = useNavigate();
  const handleSubmit = (values) => {
    console.log("form value", values);
  };
  return (
    <div>
      <Typography variant="h5" className="text-center">
        Register
      </Typography>
      <Formik onSubmit={handleSubmit} initialValues={initialValues}>
        <Form>
          <Field
            fullWidth
            as={TextField}
            name="fullName"
            label="full name"
            variant="outlined"
            margin="normal"
          />
          <Field
            fullWidth
            as={TextField}
            name="email"
            label="email"
            variant="outlined"
            margin="normal"
          />

          <Field
            fullWidth
            as={TextField}
            name="password"
            // type="password"
            label="password"
            type="password"
            variant="outlined"
            margin="normal"
          />
          <Field fullWidth
            as={Select}
            margin="normal"
            labelId="role-simple-select-label"
            id="role-simple-select"
            // value={age}
            label="Role"
            name="role"
            // onChange={handleChange}
          >
            <MenuItem value={"ROLE_CUSTOMER"}>Customer</MenuItem>
            <MenuItem value={"ROLE_RESTAURANT_OWNER"}>
              Restaurant Owner
            </MenuItem>
          </Field>

          <Button
            sx={{ mt: 2, padding: "1rem" }}
            fullWidth
            type="submit"
            variant="contained"
          >
            register
          </Button>
        </Form>
      </Formik>
      <Typography variant="body2" align="center" sx={{ mt: 3 }}>
        if have an an account already?
        <Button size="small" onClick={() => navigate("/account/login")}>
          Login
        </Button>
      </Typography>
    </div>
  );
};

export default RegisterForm;

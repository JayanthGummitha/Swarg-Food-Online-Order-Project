import logo from './logo.svg';
import './App.css';
import { CssBaseline, ThemeProvider } from '@mui/material';
import { darkTheme } from './Theme/darkTheme';
import Navbar from './component/Navbar/Navbar';
import Home from './component/Home/Home';
import RestaurantDetails from './component/Restaurantcard/RestaurantDetails';
import Cart from './component/Cart/Cart';
import ProfileNavigation from './component/Profile/ProfileNavigation';
import CustomerRoute from './Routers/CustomerRoute';
import Routers from './Routers/Routers';

function App() {
  return (
    <ThemeProvider theme={darkTheme}>
      <CssBaseline/>
       {/* <Navbar/> */}
       {/* <Home/>
       <RestaurantDetails/>
       <Cart/> */}
       {/* <ProfileNavigation/> */}
       {/* <CustomerRoute/> */}
       <Routers/>
    </ThemeProvider>
  );
}

export default App;

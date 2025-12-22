# 🍔 Swarg-Food - Online Food Delivery Platform

A full-stack online food delivery application that connects restaurants with food enthusiasts. Built with Spring Boot 3 and React 18, Swarg-Food provides a seamless multi-vendor platform for restaurant owners and customers.

![Spring Boot](https://img.shields.io/badge/Spring%20Boot-3.3.1-brightgreen)
![React](https://img.shields.io/badge/React-18.3.1-blue)
![Java](https://img.shields.io/badge/Java-17-orange)
![MySQL](https://img.shields.io/badge/MySQL-Database-blue)

## 🌟 Features

### For Customers
- 🔐 Secure user authentication with JWT
- 🍕 Browse multiple restaurants and their menus
- ❤️ Add favorite restaurants and dishes
- 🛒 Shopping cart functionality
- 💳 Secure payment processing with Stripe
- 📧 Email notifications for order updates
- 🔄 Password reset via email
- 📱 Responsive design for all devices

### For Restaurant Owners
- 🏪 Restaurant registration and management
- 📋 Dedicated admin panel for each restaurant
- 🍽️ Menu and food category management
- 🥗 Ingredient inventory tracking
- 📦 Order management system
- 🎉 Event creation and management
- 📊 Dashboard with analytics

### For Platform Administrators
- 👑 Super admin panel
- 🔐 Role-based access control
- 🏢 Multi-vendor management
- 📈 Platform-wide analytics

## 🛠️ Tech Stack

### Backend
- **Spring Boot 3.3.1** - Core framework
- **Spring Security** - Authentication & authorization
- **Spring Data JPA** - Database operations
- **MySQL** - Relational database
- **JWT (JSON Web Tokens)** - Secure authentication
- **Stripe API** - Payment processing
- **Java 17** - Programming language
- **Lombok** - Boilerplate code reduction
- **Maven** - Dependency management

### Frontend
- **React 18.3.1** - UI library
- **Redux** - State management
- **Material-UI (MUI) 5** - Component library
- **Tailwind CSS** - Utility-first styling
- **React Router DOM 6** - Navigation
- **Formik & Yup** - Form handling and validation
- **React Slick** - Carousel component
- **Day.js** - Date manipulation

## 📋 Prerequisites

Before running this project, make sure you have:

- **Java 17** or higher
- **Node.js 16** or higher
- **MySQL 8** or higher
- **Maven 3.6** or higher
- **Stripe Account** (for payment processing)

## 🚀 Getting Started

### Backend Setup

1. **Clone the repository**
```bash
git clone <repository-url>
cd swarg-food
```

2. **Configure MySQL Database**
```sql
CREATE DATABASE swarg_food;
```

3. **Update application properties**

Navigate to `backend-app/src/main/resources/application.properties` and configure:
```properties
spring.datasource.url=jdbc:mysql://localhost:3306/swarg_food
spring.datasource.username=your_mysql_username
spring.datasource.password=your_mysql_password

# JWT Configuration
jwt.secret=your_jwt_secret_key

# Stripe Configuration
stripe.api.key=your_stripe_secret_key

# Email Configuration
spring.mail.host=smtp.gmail.com
spring.mail.port=587
spring.mail.username=your_email@gmail.com
spring.mail.password=your_email_password
```

4. **Run the backend**
```bash
cd backend-app
./mvnw spring-boot:run
```

The backend server will start on `http://localhost:8080`

### Frontend Setup

1. **Navigate to frontend directory**
```bash
cd frontend-app
```

2. **Install dependencies**
```bash
npm install
```

3. **Configure environment variables**

Create a `.env` file in the `frontend-app` directory:
```env
REACT_APP_API_URL=http://localhost:8080
REACT_APP_STRIPE_PUBLIC_KEY=your_stripe_public_key
```

4. **Start the development server**
```bash
npm start
```

The frontend will start on `http://localhost:3000`

## 📁 Project Structure

```
swarg-food/
├── backend-app/
│   ├── src/
│   │   ├── main/
│   │   │   ├── java/
│   │   │   │   └── com/swarg/
│   │   │   │       ├── config/
│   │   │   │       ├── controller/
│   │   │   │       ├── model/
│   │   │   │       ├── repository/
│   │   │   │       ├── service/
│   │   │   │       └── security/
│   │   │   └── resources/
│   │   └── test/
│   └── pom.xml
│
└── frontend-app/
    ├── public/
    ├── src/
    │   ├── AdminComponent/
    │   │   ├── Admin/
    │   │   ├── Dashboard/
    │   │   ├── Menu/
    │   │   ├── Orders/
    │   │   ├── Ingredients/
    │   │   ├── Events/
    │   │   └── FoodCategory/
    │   ├── component/
    │   ├── Routers/
    │   ├── Theme/
    │   ├── App.js
    │   └── index.js
    └── package.json
```

## 🔑 Key Functionalities

### Authentication & Authorization
- JWT-based authentication
- Role-based access control (Customer, Restaurant Owner, Admin)
- Secure password encryption
- Email verification and password reset

### Restaurant Management
- Create and manage restaurant profiles
- Upload restaurant images and details
- Set operating hours and delivery areas
- Manage restaurant status (open/closed)

### Menu Management
- Create food categories
- Add/edit/delete menu items
- Manage ingredients and availability
- Set pricing and discounts

### Order Processing
- Real-time order tracking
- Order status updates
- Email notifications
- Order history

### Payment Integration
- Secure Stripe payment gateway
- Multiple payment methods
- Transaction history
- Refund management

## 🎨 UI Components

- **Carousel Display** - Showcase featured restaurants and dishes
- **Add to Favorites** - Save favorite restaurants
- **Shopping Cart** - Manage orders before checkout
- **Responsive Design** - Mobile-first approach
- **Material-UI Components** - Professional and consistent UI
- **Tailwind Utilities** - Custom styling flexibility

## 🔒 Security Features

- JWT token-based authentication
- Password encryption with BCrypt
- CORS configuration
- SQL injection prevention
- XSS protection
- CSRF protection

## 📧 Email Notifications

- Order confirmation emails
- Order status updates
- Password reset emails
- Welcome emails for new users

## 🧪 Testing

### Backend Tests
```bash
cd backend-app
./mvnw test
```

### Frontend Tests
```bash
cd frontend-app
npm test
```

## 📦 Building for Production

### Backend
```bash
cd backend-app
./mvnw clean package
java -jar target/Online-Food-Order-0.0.1-SNAPSHOT.jar
```

### Frontend
```bash
cd frontend-app
npm run build
```

## 🤝 Contributing

Contributions are welcome! Please follow these steps:

1. Fork the repository
2. Create a feature branch (`git checkout -b feature/AmazingFeature`)
3. Commit your changes (`git commit -m 'Add some AmazingFeature'`)
4. Push to the branch (`git push origin feature/AmazingFeature`)
5. Open a Pull Request

## 📝 License

This project is licensed under the MIT License - see the LICENSE file for details.

## 👨‍💻 Author

**Swarg-Food Team**

## 🙏 Acknowledgments

- Spring Boot community for excellent documentation
- React team for the powerful UI library
- Material-UI for beautiful components
- Stripe for secure payment processing

## 📞 Support

For support, email support@swargfood.com or open an issue in the repository.

---

⭐ If you find this project useful, please consider giving it a star!

**Built with ❤️ using Spring Boot and React**

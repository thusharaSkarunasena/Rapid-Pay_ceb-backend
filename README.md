# Rapid Pay - CEB Backend API

## Description
This demo API is a part of the 'Rapid Pay' project which is developed as a utility bill payment platform.
CEB backend API is used to check if the given account number for the 'CEB' bill payment is a valid account number.
API is hosted to 'Heroku' & API endpoints are not secured.

## Technologies Used
* Spring Boot
* PostgreSQL

## API Demo Url
[https://rapidpay-ceb.herokuapp.com/](https://rapidpay-ceb.herokuapp.com/)
	
## API Endpoints
	/ceb_user/getAllCebUsers
	/ceb_user/getCebUser/{id}
	/ceb_user/checkCebUser/{account_number}
	/ceb_user/saveCebUser
	/ceb_user/updateCebUser
	/ceb_user/deleteCebUser/{id}

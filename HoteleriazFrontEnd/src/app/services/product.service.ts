import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class ProductService {

  constructor() { }

  products = [
    {
      id: 1,
      name: 'Hotel Paraíso',
      category: '5 Estrellas',
      price: 299.99,
      image: 'https://cloudfront-us-east-1.images.arcpublishing.com/infobae/TBF3OLDXRVFA5CBDDVOJ3HCUYI.jpg'
    },
    {
      id: 2,
      name: 'Hotel Sol y Mar',
      category: '4 Estrellas',
      price: 199.99,
      image: 'https://www.imghoteles.com/wp-content/uploads/sites/1709/nggallery/desktop-pics//fott1.jpg'
    },
    {
      id: 3,
      name: 'Hotel Montaña Azul',
      category: '3 Estrellas',
      price: 99.99,
      image: 'https://digital.ihg.com/is/image/ihg/ihgor-member-rate-web-offers-1440x720'
    }
  ];

  getProducts() {
    return this.products;
  }
}

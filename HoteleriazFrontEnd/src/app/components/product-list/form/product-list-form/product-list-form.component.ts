import { CommonModule } from '@angular/common';
import { Component,Inject } from '@angular/core';
import { FormBuilder, FormGroup, ReactiveFormsModule } from '@angular/forms';
import { MatButtonModule } from '@angular/material/button';
import { MatDialogRef, MAT_DIALOG_DATA, MatDialogModule } from '@angular/material/dialog';
import { MatInputModule } from '@angular/material/input';

@Component({
  selector: 'app-product-list-form',
  imports: [CommonModule, MatDialogModule, MatButtonModule, MatInputModule, ReactiveFormsModule],
  templateUrl: './product-list-form.component.html',
  styleUrl: './product-list-form.component.scss'
})
export class ProductListFormComponent {
  product: any = {};
  productForm: FormGroup;

  constructor(
    public dialogRef: MatDialogRef<ProductListFormComponent>,
    @Inject(MAT_DIALOG_DATA) public data: { mode: string; product?: any },
    private fb: FormBuilder
  ) {
    this.productForm = this.fb.group({
      name: [data.product?.name || ''],
      category: [data.product?.category || ''],
      price: [data.product?.price || ''],
      image: [data.product?.image || '']
    });
  }

  close(): void {
    this.dialogRef.close();
  }
}

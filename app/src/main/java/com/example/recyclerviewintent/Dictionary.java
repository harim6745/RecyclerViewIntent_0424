package com.example.recyclerviewintent;


    public class Dictionary {

        private String product;
        private String prod_img;

        public String getProduct() {
            return product;
        }

        public void setProduct(String product) {
            this.product = product;
        }

        public String getProd_img() {
            return prod_img;
        }

        public void setProd_img(String prod_img) {
            this.prod_img = prod_img;
        }


        public Dictionary(String product, String prod_img) {
            this.product = product;
            this.prod_img = prod_img;
        }
}

public class ItemFruit {
        private String name;
        private int imageResource;
        private String description;

        public ItemFruit(String name,int imageResource,String description) {
            this.name = name;
            this.imageResource = imageResource;
            this.description = description;
        }
        public String getName() {
            return this.name;
        }
        public int getimageResource()
        {
            return this.imageResource;
        }
        public String getdescription()
        {
            return this.description;
        }
}



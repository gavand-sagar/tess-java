class Tree implements  ITree{
    Point root;
    int height(Point N) {
        if (N == null)
            return 0;

        return N.height;
    }
    int max(int a, int b) {
        return (a > b) ? a : b;
    }

    Point rightRotate(Point y) {
        Point x = y.left;
        Point T2 = x.right;

        x.right = y;
        y.left = T2;

        y.height = max(height(y.left), height(y.right)) + 1;
        x.height = max(height(x.left), height(x.right)) + 1;

        return x;
    }

    Point leftRotate(Point x) {
        Point y = x.right;
        Point T2 = y.left;

        y.left = x;
        x.right = T2;

        x.height = max(height(x.left), height(x.right)) + 1;
        y.height = max(height(y.left), height(y.right)) + 1;

        return y;
    }

    int getBalance(Point N) {
        if (N == null)
            return 0;

        return height(N.left) - height(N.right);
    }

    public void display() {
        display(root,"");
    }
    public void display(Point p,String indentation){
        if(p != null){
            System.out.println(indentation + "-" + p.key);
            display(p.left,indentation + " L");
            display(p.right,indentation + " R");
        }
    }
    public void insert(int key) {
        this.root = insert(this.root,key);
    }
    Point insert(Point Point, int key) {

        if (Point == null)
            return (new Point(key));

        if (key < Point.key)
            Point.left = insert(Point.left, key);
        else if (key > Point.key)
            Point.right = insert(Point.right, key);
        else
            return Point;

        Point.height = 1 + max(height(Point.left),
                height(Point.right));

        int balance = getBalance(Point);

        if (balance > 1 && key < Point.left.key)
            return rightRotate(Point);

        if (balance < -1 && key > Point.right.key)
            return leftRotate(Point);

        if (balance > 1 && key > Point.left.key) {
            Point.left = leftRotate(Point.left);
            return rightRotate(Point);
        }

        if (balance < -1 && key < Point.right.key) {
            Point.right = rightRotate(Point.right);
            return leftRotate(Point);
        }

        return Point;
    }


    public  int next(int input){
        //find the given number and keep track of parent item
            //once found
                //check right
                // if right then keep going to left and return the most left element
                // if right doesn't exists return parent item

        if(input == this.root.key){
            Point temp = this.root;
            if(temp.right != null){
                return extractedForNext(temp);
            }
        }else{
            int parent = this.root.key;
            Point temp = this.root;
            while (temp.key!=input){
                if(input < temp.key){
                    parent = temp.key;
                    temp = temp.left;
                }else{
                    temp = temp.right;
                }
            }
            if(temp.right != null){
                return extractedForNext(temp);
            }else{
                return parent;
            }
        }
        return 0;
    }
    private static int extractedForNext(Point temp) {
        Point left = temp.right.left;
        if(left == null){
            return temp.right.key;
        }
        while (left.left != null){
            left = left.right;
        }
        return left.key;
    }


    public  int prev(int input){
        //find the given number and keep track of parent item
            //once found
                //check left
                // if left  then keep going to right and return the most right element
                // if left doesn't exists return parent item

        if(input == this.root.key){
            Point temp = this.root;
            if(temp.left != null){
                return extractedForPrev(temp);
            }
        }else{
            int parent = this.root.key;
            Point temp = this.root;
            while (temp.key!=input){
                if(input < temp.key){
                    temp = temp.left;
                }else{
                    parent = temp.key;
                    temp = temp.right;
                }
            }
            if(temp.left != null){
                return extractedForPrev(temp);
            }else{
                return parent;
            }
        }
        return 0;
    }

    private static int extractedForPrev(Point temp) {
        Point right = temp.left.right;
        if(right == null){
            return temp.left.key;
        }
        while (right.right != null){
            right = right.right;
        }
        return right.key;
    }
}
public class Vector3 {
    public double x;
    public double y;
    public double z;

    public Vector3(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public Vector3 MultiplyBy(double n) {
        return new Vector3(this.x * n, this.y * n, this.z * n);
    }

    public static Vector3 MultiplyBy(Vector3 v, double n) {
        return v.MultiplyBy(n);
    }

    public Vector3 Add(Vector3 v) {
        return new Vector3(this.x + v.x, this.y + v.y, this.z + v.z);
    }

    public static Vector3 Add(Vector3 i, Vector3 k) {
        return i.Add(k);
    }

    public Vector3 Substract(Vector3 v) {
        return this.Add(v.MultiplyBy(-1));
    }

    public static Vector3 Substract(Vector3 i, Vector3 k) {
        return i.Substract(k);
    }

    public double MultiplyScalar(Vector3 v) {
        return this.x * v.x + this.y * v.y;
    }

    public static double MultiplyScalar(Vector3 i, Vector3 k) {
        return i.MultiplyScalar(k);
    }

    public Vector3 MultiplyVector(Vector3 v) {
        return new Vector3(
                (this.y * v.z - v.y * this.z),
                (this.x * v.z - v.x * this.z),
                (this.x * v.y - v.x * this.y)
        );
    }

    public static Vector3 MultiplyVector3(Vector3 i, Vector3 k) {
        return i.MultiplyVector(k);
    }
    public void translate(double x, double y, double z){
        this.x+=x;
        this.y+=y;
        this.z+=z;
    }
    public void printing(){
        System.out.print(this.x + " " + this.y + " " + this.z);
    }
    public void RotateX(double n) {
        n = Math.toRadians(n);
        this.y = y * Math.cos(n) + z * Math.sin(n);
        this.z = -y * Math.sin(n) + z * Math.cos(n);
        //return new Vector3(this.x,this.y,this.z);
    }

    public void RotateY(double n) {
        n = Math.toRadians(n);
        this.x = x * Math.cos(n) + z * Math.sin(n);
        this.z = -x * Math.sin(n) + z * Math.cos(n);
        //return new Vector3(this.x,this.y,this.z);
    }

    public void RotateZ(double n) {
        n = Math.toRadians(n);
        this.x = x * Math.cos(n) - y * Math.sin(n);
        this.y = -x * Math.sin(n) + y * Math.cos(n);
        //return new Vector3(this.x,this.y,this.z);
    }

    public void Rotate(double ux,double uy,double uz) {
        this.RotateX(ux);
        this.RotateY(uy);
        this.RotateZ(uz);
        //return new Vector3(this.x,this.y,this.z);
    }

    public void mashtab(double g) {
        this.x = x*g;
        this.y = y*g;
        this.z = z*g;
        //return new Vector3(this.x,this.y,this.z);
    }

    @Override
    public String toString() {
        return "Vector3{" + "x=" + x + ", y=" + y + ", z=" + z + '}';
    }
}
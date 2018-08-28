abstract class vehicle
{
abstract public void Start();
public void Stop()
{
System.out.println("Stop() called for");
}
}
class twowheeler extends vehicle
{
public void Start()
{
System.out.println("Start() for twowheeler called");
}
public void Stop()
{
super.Stop();
System.out.println("twowheeler");
}
}
class fourwheeler extends vehicle
{
public void Start()
{
System.out.println("Start() for fourwheeler called");
}
public void Stop()
{
super.Stop();
System.out.println("fourwheeeler");
}
}
class vehicle1
{
public static void main(String[] args)
{
twowheeler a= new twowheeler();
fourwheeler b=new fourwheeler();
a.Start();
b.Start();
a.Stop();
b.Stop();
}
}
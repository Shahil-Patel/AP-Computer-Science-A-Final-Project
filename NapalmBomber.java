public class NapalmBomber
{
	private int h;
	private int w;
	private int xcord;
	private int ycord;
	public NapalmBomber(int xcord,int ycord, int h,int w)
	{
		this.h=h;
		this.w=w;
		this.xcord=xcord;
		this.ycord=ycord;
	}
	public int getH()
	{
		return h;
	}
	public int getW()
	{
		return w;
	}
	public int getXcord()
	{
		return xcord;
	}
	public int getYcord()
	{
		return ycord;
	}
	public int moveLeft()
	{
		return -8;
	}
	public int moveRight()
	{
		return 8;
	}
	public void addXcord(int r)
	{
		xcord+=r;
	}
	public void setXcord(int r)
	{
		xcord=r;
	}
}

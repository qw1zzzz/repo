package ru.oop;

public class JukeBox
{
    public void music(int position)
    {
        switch(position)
        {
            case 1:
                System.out.println("Пусть бегут неуклюже");
                break;
            case 2:
                System.out.println("Спокойной ночи");
                break;
            default:
                System.out.println("Песня не найдена");
                break;
        }
    }

    public static void main(String[] args)
    {
        JukeBox disk = new JukeBox();
        disk.music(1);
        disk.music(2);
        disk.music(10);
    }
}

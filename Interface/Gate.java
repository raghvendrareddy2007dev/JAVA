class Gate
{
    static void check(EntryPass card,String place)
    {
        if(card.canEnter(place))
        {
            System.out.println("Entry allowed"+place);

        }
        else
        {
            System.out.println("Entry notallowed"+place);
        }
    }
}
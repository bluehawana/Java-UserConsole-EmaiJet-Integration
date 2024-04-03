# Inlämningsrapport

Information
OBS!!! Ändra absolut inte på rubrikerna i denna fil!!!!

## Inledning

### Vad handlar uppgiften om?
Denna uppgift handlar om att skapa en temporär lösenordsmekanism för att kunna logga in på en webbapplikation. Man måste skapa en ny användare och sedan logga in med användaren för att få ett temporärt lösenord. Detta lösenordet skickas till användarens e-postadress och användaren kan sedan logga in med detta lösenord. Lösenordet är giltigt i 10 minuter. Mycket jobb med integration av e-post och lösenordsmekanism och api.
--- Skriv ovanför och ta inte bort denna raden ---

### Hur uppfattade du uppgiften initialt?
Från början var jag lite osäker på hur jag skulle lösa uppgiften. Jag hade aldrig jobbat med att skicka e-postmeddelanden från en webbapplikation tidigare och var osäker på hur jag skulle gö och om det skulle fixade med lösningar som jag hade använt tid och arbetat med tid.
--- Skriv ovanför och ta inte bort denna raden ---

## Planering och genomförande

### Hur planerade du att lösa uppgiften?
Jag planerade att först skapa en ny användare och sedan skapa en ny inloggningssida där användaren kan logga in med sin e-postadress och lösenord. Sedan skulle jag skapa en ny sida där användaren kan skicka ett e-postmeddelande med ett temporärt lösenord. Jag skulle sedan skapa en ny sida där användaren kan logga in med det temporära lösenordet. Denna upgiten skulle jag lösa med att använda mig av MJ_API_PUBLIC_KEY och MJ_API_SECRET_KEY, som jag hade använt tidigare i en annan uppgift. Jag skulle också använda mig av `nodemailer` för att skicka e-postmeddelanden.
--- Skriv ovanför och ta inte bort denna raden ---

### Vilka steg tog du för att lösa uppgiften, skiljer sig ditt utförande från tidigare uppgifter?
Den första steg tog jag provade med lämnade inlämning och sedan skapade jag en ny användare och sedan skapade jag en ny inloggningssida där användaren kan logga in med sin e-postadress och lösenord. Sedan skapade jag en ny sida där användaren kan skicka ett e-postmeddelande med ett temporärt lösenord. Jag skapade en ny sida där användaren kan logga in med det temporära lösenordet. Jag använde mig av `nodemailer` för att skicka e-postmeddelanden. Efter läst report om test så vet jag vad jag ska göra och hur jag ska göra det och viken steg jag ska ta för att lösa uppgiften.

--- Skriv ovanför och ta inte bort denna raden ---

## Utmaningar och lösningar

### Vilka utmaningar stötte du på under projektet?
I user class det finns bara två parameter som name och email, men från början, jag tror måste vi har lösenord också i user class. När jag gjort med lösenord och testat så fungerade inte. Jag har inte fått något felmeddelande men kan inte fick godkänt på gitlab pipeline. Så jag har gjort det igen för att passa testing.
--- Skriv ovanför och ta inte bort denna raden ---

### Hur löste du dessa utmaningar?
Jag kollade på min kod och såg att jag hade glömt att lägga till lösenordet i user class. Jag la till lösenordet i user class och testade igen och då fungerade det. Jag fick godkänt på gitlab pipeline. Jag har också kollat på min kod och sett att jag hade glömt att lägga till `nodemailer` i min kod. Jag la till `nodemailer` i min kod och testade igen och då fungerade det. Jag fick godkänt på gitlab pipeline. Jag hittade kod från lars igen från tidigare uppgift och använde mig av den koden för att skicka e-postmeddelanden.
--- Skriv ovanför och ta inte bort denna raden ---

### Hur fungerar din temporära lösenordsmekanism?
Min temporära lösenordsmekanism fungerar genom att användaren skapar en ny användare och sedan loggar in med användaren för att få ett temporärt lösenord. Detta lösenordet skickas till användarens e-postadress och användaren kan sedan logga in med detta lösenord. Lösenordet är giltigt i 10 minuter, och användaren kan logga in med det temporära lösenordet. Sedan kan användaren skapa en ny användare och logga in med användaren för att få ett nytt temporärt lösenord. Detta lösenordet skickas till användarens e-postadress och användaren kan sedan logga in med detta lösenord. Lösenordet är giltigt i 10 minuter, och användaren kan logga in med det temporära lösenordet.
--- Skriv ovanför och ta inte bort denna raden ---

## Reflektion och utvärdering

### Vad lärde du dig genom att genomföra projektet?
Det finns mycket att göra och lära mig med att skicka e-postmeddelanden från en webbapplikation. Jag lärde mig att hur kan man integrara e-postmeddelanden i en webbapplik med hjälp av `nodemailer`. Jag lärde mig också att hur använda API till exempel MJ_API_PUBLIC_KEY och MJ_API_SECRET_KEY för att skicka e-postmeddelanden. Jag lärde mig också att bygga en temporär lösenordsmekanism för att kunna logga in på en webbapplikation.
--- Skriv ovanför och ta inte bort denna raden ---

### Vilka möjligheter ser du för framtida projekt baserat på denna erfarenhet?
I framtiden kan jag använda mig av denna erfarenhet för att skicka e-postmeddelanden från en webbapplikation. Jag kan också använda mig av denna erfarenhet för att integrera e-postmeddelanden i en webbapplikation. Jag kan också använda mig av denna erfarenhet för att bygga en temporär lösenordsmekanism för att kunna logga in på en webbapplikation. Jag kan också använda mig av denna erfarenhet för att använda API till exempel MJ_API_PUBLIC_KEY och MJ_API_SECRET_KEY för att skicka e-postmeddelanden. Jag kan också använda mig av denna erfarenhet för att använda `nodemailer` för att skicka e-postmeddelanden.
--- Skriv ovanför och ta inte bort denna raden ---

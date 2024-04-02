# Vecka 7: Avancerad Integration med Temporära Lösenord

## Beskrivning

Projektet för vecka 7 utmanar studenterna att utveckla en mikrotjänst för användarhantering i Java som hanterar
inloggning genom att skicka ett temporärt lösenord till användarens e-post. Detta lösenord är giltigt i en kort period
eller tills användaren loggar ut. Projektet syftar till att ge praktisk erfarenhet av systemintegration, minneshantering
och säker användarautentisering utan att spara lösenordet i en databas.

## Mål

- Implementera en mikrotjänst som skapar och skickar ett temporärt lösenord för användarinloggning.
- Garantera att det temporära lösenordet är giltigt endast i 5 minuter eller tills användaren loggar ut.
- Utveckla mekanismer för att ogiltigförklara det temporära lösenordet efter användning eller när tidsgränsen uppnås.
- Använd Java för att utveckla mikrotjänsten, hantera e-postskickning och utföra lösenordslogik.

## Förkunskaper

- Erfarenhet av Java-programmering.
- Bekantskap med hantering av e-post i Java.
- Grundläggande förståelse av minneshantering och säkerhetsprinciper.
- Använda Mailjet för att skicka e-postmeddelanden samt ha ett registrerat konto hos dem med giltiga API-nycklar. Se mer
  i [free_email_account.md](free_email_account.md) för att skaffa ett konto.

## Färdigheter som utvecklas

- Förmågan att skapa säkra autentiseringsflöden utan permanent lösenordslagring.
- Kunskap i integrationsplattformar och Java för systemintegration.
- Praktisk erfarenhet av att hantera temporära lösenordsmekanismer och e-postintegration.

## Steg-för-Steg Instruktioner

1. **Mikrotjänstsetup:** Detta projektet.
2. **Temporärt Lösenord:** Utveckla logiken för att generera och skicka det temporära lösenordet via e-post.
3. **Minneshantering:** Implementera ett system för att spara och kontrollera det temporära lösenordets giltighet i
   minnet.
4. **Autentiseringsflöde:** Skapa ett flöde där användaren kan logga in med det temporära lösenordet och sedan logga ut.
5. **Ogiltigförklaring av Lösenord:** Säkerställ att lösenordet blir ogiltigt efter utloggning eller när giltighetstiden
   passerat.
6. **Overriding av email:** Implementera en mekanism för att ersätta exempel e-postadressen med en riktig e-postadress
   från din .env fil, hämta variabeln `TO_EMAIL` och maila dit istället.
7. **Registrering:** Ni ska kunna registrera ny användare och skicka ett temporärt lösenord till användaren, dvs
   verifiera email adressen innan registreringen slutförs.

## Ni ska leverera

- Källkoden för mikrotjänsten som hanterar det temporära lösenordet.
- Dokumentation som beskriver hur lösenordshantering och den tidsbegränsade inloggningsfunktionen fungerar.

## Bedömningskriterier

- **Funktionalitet:** Lösningen uppfyller alla generella krav och fungerar som förväntat.
- **Kodkvalitet:** Koden är välstrukturerad, välkommenterad och lätt att följa.
- **Säkerhet:** Autentiseringsflödet är säkert, och lösenord hanteras korrekt utan långvarig lagring.
- **Dokumentation:** Projektet är väl dokumenterat, med tydliga instruktioner och förklaringar av designbeslut.

Lycka till och ha kul!

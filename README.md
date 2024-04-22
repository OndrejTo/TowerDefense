![](ZadaniObrazky/logoplaceholder.png)

# Greenfoot Tower Defense

## Autoři

- **Ondřej Tomašťík**
- **Marek Reich**
- **Oliver Šesták**

*Tato hra vznikla jako projekt v rámci Programování I. na Obchodní akademii Uherské Hradiště.*

---

## Téma
 
Hra se odehrává v okolí tvrze, kde hráč brání svou pevnost před útoky nepřátelských sil (balónků). Jednotlivé prvky reprezentují různé typy obranných věží, které hráč může stavět, a nepřátelské jednotky, které se snaží prolomit obranu, dále se ve hře nacházejí schopnosti, které hráč využívá pro zničení či spomalení balónků.

## Úkol hráče
 
Hráč musí postavit a strategicky umístit obranné věže tak, aby zastavil postup nepřátelských aktérů a zabránil jim v průniku do pevnosti, zároveň může používat schopnost pro splnění úkolu.

## Ovládání hry

Hráč bude hru ovládat pomocí myši, kde klikáním na herní plochu umísťuje a upravuje obranné věže.

## Aktéři

### Obranné věže
Obranné věže jsou klíčovými prvky ve hře. Jsou to stavby umístěné na strategických pozicích po celé mapě, které slouží k ochraně proti nepřátelským útokům. Každá obranná věž má své vlastnosti a schopnosti, které hráč může využít k efektivní obraně pevnosti. Pomocí mincí (herní měny) může hráč každou věž až dvakrát vylepšit pro vylepšení dosavadních atributů. 

#### Typy věží

- **Střelecká věž**  

	![](ZadaniObrazky/BasicTurretTiers.png)

	Tato věž má malé poškození (zabije jen jednoho nepřátele), ale má rychlou palbu (střílí jednou za 30 kol) a je velmi účinná proti slabším nepřátelům. Je vhodná k útoku na zbytky nepřátelských jednotek na konci mapy. Na pořízení této věže potřebujeme 35 mincí.

	| Úroveň | Cena vylepšení | Poškození | Rozsah | Kadence |
	|:-:|:-:|:-:|:-:|:-:|
	| 1 | 35 | 3 | 50 px | 1/30 kol |
	| 2 | 50 | 5 | 75 px | 1/30 kol |
	| 3 | 100 | 8 | 100 px | 1/30 kol |

- **Dělo**  
	
	![](ZadaniObrazky/CannonTiers.png)
	
	Dělo je specializováno na ničení skupin nepřátel a obranu proti větším hrozbám. Systém dělových koulí může způsobit rozsáhlé poškození většímu množství nepřátelských jednotek najednou. Na pořízení této věže potřebujeme 50 mincí.

	| Úroveň | Cena vylepšení | Poškození | Rozsah | Kadence |
	|:-:|:-:|:-:|:-:|:-:|
	| 1 | 50 | 3 | 40 px | 1/60 kol |
	| 2 | 100 | 5 | 60 px | 1/60 kol  |
	| 3 | 150 | 10 | 80 px | 1/60 kol  |

- **Elektrická věž**  

	![](ZadaniObrazky/ElectricTowerTiers.png)

	Tato věž vytvoří eletrické pole v nejbližším okolím a poškodí všechny nepřátelské jednotky, které se v poli nachází. Na pořízení této věže potřebujeme 75 mincí.

	| Úroveň | Cena vylepšení | Poškození | Působiště |
	|:-:|:-:|:-:|:-:|
	| 1 | 75 | 4/s | 50 px | 
	| 2 | 125 | 8/s | 75 px |
	| 3 | 200 | 12/s | 100 px |

### Nepřátelské jednotky

Nepřátelské jednotky se objevují na začátku trasy na mapě a postupují směrem k pevnosti hráče.  
Každá jednotka má stejnou trasu pohybu, kterou musí dodržovat.
Nepřátelské jednotky se pohybují určitou rychlostí a mají různou odolnost vůči útokům.  
Ve hře jsou různé typy nepřátelských jednotek, každá s vlastními rychlostí a výdrží.  

#### Typy nepřátelských jednotek

- **Červený balónek**  

	![](ZadaniObrazky/balloon1.png)

	Tento balónek je pomalý (pohybuje se rychlostí jeden pixel za krok hry) a nejméně odolný (má jen 5 životů), ale vyskytuje se nejčastěji.
Při zničení generuje hráči 1 až 3 mince.

- **Modrý balónek**  

	![](ZadaniObrazky/BlueEnemy.png)

	Tento balónek je více odolný proti útokům (má více životů - 10 životů), ale je stejně pomalý jako červený balónek.
Při zničení generuje hráči 2 až 4 mince.

- **Růžový balónek**  

	![](ZadaniObrazky/fastenemy.png)

	Tento balónek je velmi rychlý (pohybuje se rychlostí tří pixelů za krok hry) a velmi odolný (má 20 životů) oproti modrému a červenému balónku.
Při zničení generuje hráči 5 až 8 mincí.

- **Vzducholoď**  

	![](ZadaniObrazky/Airship1.png)
	
	Tato vzducholoď je nejnebezpečnější nepřátel ve hře. Má největší poškození (ubere 5 životů) a vydrží velmi dlouho (má 100 životů).
Je určena pro poslední vlny hry.
Při zničení generuje hráči 10 až 20 mincí.

	| Typ balónku | Počet životů | Poškození | Působiště |
	|:-:|:-:|:-:|:-:|
	| 1 | 75 | 4/s | 50 px | 
	| 2 | 125 | 8/s | 75 px |
	| 3 | 200 | 12/s | 100 px |

### Schopnosti

Kromě stavby věží a vylepšování věží může hráč také používat schopnosti (ability) pro ovlivnění průběhu hry pro svůj prospěch.
Pro použití schopnosti musí hráč splnit následující podmínky: je splněn časový požadavek (schopnosti můžeme použít pouze jednou za určitý čas)
a finanční požadavek (pro aktivace schopnosti je potřeba uhradit předem stanovenou sumu mincí)

#### Typy schopností

- **Padající meteority**  

	![](ZadaniObrazky/Meteorite.png)

	Spustí se vlna 15 padajících meteoritů pohybujících se vertikálně od horního okraje rychlostí 3 pixely za jeden krok.
Pokud se některý z meteoritů dotkne nepřítele, sebere mu 50 životů a zmizí. 
Hráč může vyvolat schopnost jednou za 3600 kol (60 sekund) hry a při použití se mu odečte 150 mincí (pokud má).

- **Lepidlová louže**  

	![](ZadaniObrazky/Glue.png)

	Hráč umístí do hracího pole kruh symbolizující lepidlo, který zpomalí všechny nepřátele kolidující s kruhem.
Hráč může vyvolat schopnost jednou za 1800 kol (30 sekund) hry a při použití se mu odečte 75 mincí (pokud má).

### Ekonomika hry

Pro používání aktérů je ve hře obsažen systém mincí sloužící k přidávání věží, jejich vylepšování a používání schopností.
Hráč na začátku hry obdrží startovací kredit ve výši 100 mincí.

## Cíl hry

Hra končí, když hráč úspěšně ubrání pevnost po určeném počtu vln nebo se balónky přes obranu pevnosti proplíží. Výsledek hráče se vyhodnotí na základě toho, kolik vln nepřátel hráč zastavil a kolik poškození pevnost utrpěla.

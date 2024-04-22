![](logoplaceholder.png)

# Greenfoot Tower Defense

## Autoři: 

- Ondřej Tomašťík
- Marek Reich
- Oliver Šesták

*Tato hra vznikla jako projekt v rámci Programování I. na Obchodní akademii Uherské Hradiště.*

---

## Téma:
 
Hra se odehrává v moderní světě, kde hráč brání svou pevnost před útoky nepřátelských sil (balónků). Jednotlivé prvky reprezentují různé typy obranných věží, které hráč může stavět, a nepřátelské jednotky, které se snaží prolomit obranu.

## Úkol hráče:
 
Hráč musí postavit a strategicky umístit obranné věže tak, aby zastavil postup nepřátelských sil a zabránil jim v průniku do pevnosti.

## Ovládání hry:

Hráč bude hru ovládat pomocí myši, kde klikáním na herní plochu umísťuje a upravuje obranné věže.

## Aktéři:

### Obranné věže:
Obranné věže jsou klíčovými prvky ve hře. Jsou to stavby umístěné na strategických pozicích po celé mapě, které slouží k ochraně proti nepřátelským útokům. Každá obranná věž má své vlastnosti a schopnosti, které hráč může využít k efektivní obraně pevnosti.

#### Typy věží:

- **Střelecká věž:**  

	Tato věž má malé poškození (zabije jen jednoho nepřátele), ale má rychlou palbu (střílí jednou za 30 kol) a je velmi účinná proti slabším nepřátelům. Je vhodná k útoku na zbytky nepřátelských jednotek na konci mapy. Na pořízení této věže potřebujeme 35 mincí.

	| Úroveň | Cena vylepšení | Poškození | Rozsah | Kadence |
	|    :-:   |    :-:   |    :-:   |  :-:   |  :-:   |
	| 1 | 35 | 3 | X | X |
	| 2 | 50 | 5 | X | X |
	| 3 | 100 | 8 | X | X |

- **Dělo:**  

	Dělo je specializováno na ničení skupin nepřátel a obranu proti větším hrozbám. Systém kanónových koulí může způsobit rozsáhlé poškození většímu množství nepřátelských jednotek najednou.

	| Úroveň | Cena vylepšení | Poškození | Rozsah | Kadence |
	|    :-:   |    :-:   |    :-:   |  :-:   |  :-:   |
	| 1 | X | X | X | X |
	| 2 | X | X | X | X |
	| 3 | X | X | X | X |

- **Elektrická věž**  

	Tato věž vytvoří eletrické pole v nejbližším okolím a poškodí všechny nepřátelské jednotky, které se v poli nachází.

	| Úroveň | Cena vylepšení | Poškození | Působiště | Kadence |
	|    :-:   |    :-:   |    :-:   |  :-:   |  :-:   |
	| 1 | X | X | X | X |
	| 2 | X | X | X | X |
	| 3 | X | X | X | X |

### Nepřátelské jednotky (DOPLNIT):

Nepřátelské jednotky se objevují na začátku trasy na mapě a postupují směrem k pevnosti hráče.  
Každá jednotka má stejnou trasu pohybu, kterou musí dodržovat.
Nepřátelské jednotky se pohybují určitou rychlostí a mají různou odolnost vůči útokům.  
Ve hře jsou různé typy nepřátelských jednotek, každá s vlastními schopnostmi a zranitelnostmi.  

#### Typy nepřátelských jednotek:

- **Červený balónek:**  
Tento balónek je pomalý (pohybuje se rychlostí jeden pixel za krok hry) a nejméně odolný (má jen 5 životů), ale může vám projít skrz vaše obrany, jestli nejste opatrný.

- **Modrý balónek:**  
Tento balónek je více odolný proti útokům (má více životů - 10 životů), ale je stejně pomalý jako červený balónek.

- **Růžový balónek:**  
Tento balónek je velmi rychlý (pohybuje se rychlostí tří pixelů za krok hry) a velmi odolný (má 20 životů) oproti modrému a červenému balónku.

- **Vzducholoď**  
Tato vzducholoď je nejkrutější nepřátel ve hře. Má největší poškození (ubere 5 životů) a vydrží velmi dlouho (má 100 životů).
Je určena pro poslední vlny hry.


## Cíl hry:

Hra končí, když hráč úspěšně ubrání pevnost po určeném počtu vlnách nebo se jednotky probourají přes obranu pevnosti. Výsledek hráče se vyhodnotí na základě toho, kolik vln nepřátel hráč zastavil a kolik poškození pevnosti utrpěl.

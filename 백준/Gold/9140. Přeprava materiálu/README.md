# [Gold V] Přeprava materiálu - 9140 

[문제 링크](https://www.acmicpc.net/problem/9140) 

### 성능 요약

메모리: 65636 KB, 시간: 556 ms

### 분류

다익스트라(dijkstra), 그래프 이론(graphs)

### 문제 설명

<p>Při přestavbě malostranské budovy na školku je třeba převézt mnoho materiálu z jednoho místa na druhé. Převáží se například cement, písek nebo ocelové pruty, ale i poněkud křehčí zboží, jako například lavice, okna nebo počítače. Podle typu nákladu je samozřejmě třeba zvolit správný typ automobilu. A protože nafta je v dnešní době velmi drahá, je třeba také projet s automobilem co nejkratší možnou cestou. Ačkoliv systém silnic není přehnaně hustý, je dosti komplikované se v něm vyznat, a tak se fakulta rozhodla, že si nechá napsat program, který jí pomůže při rozvrhování tras pro jednotlivé náklady.</p>

### 입력 

 <p>Na vstupu je několik bloků pro jednotlivé náklady. Každý blok začíná řádkem se čtyřmi čísly <var>N</var>, <var>M</var>, <var>S</var> a <var>C</var>, kde <var>N</var> je počet významných míst v síti silnic (1 ≤ <var>N</var> ≤ 10 000), <var>M</var> je počet silnic (<var>M</var> ≤ 50 000), které mezi významnými místy vedou, <var>S</var> je číslo významného místa (místa číslujeme od jedné do <var>N</var>), odkud je náklad vezen, a <var>C</var> je číslo místa, kam se má náklad dopravit. Vstup je ukončen řádkem obsahujícím čtyři nuly. Tento řádek nemáte dále zpracovávat. Pak v bloku následuje <var>M</var> řádků popisující jednotlivé cesty mezi místy. Každý z řádků obsahuje tři celá čísla <var>A</var>, <var>B</var> a <var>V</var> oddělená mezerou. <var>A</var> je číslo místa, odkud vede silnice, <var>B</var> je číslo místa, kam vede silnice (silnice jsou jednosměrné), a <var>V</var> jsou náklady na přepravu materiálu po této silnici (1 ≤ <var>V</var> ≤ 1 000). Můžete předpokládat, že cesta mezi počátečním a cílovým místem vždy existuje.</p>

### 출력 

 <p>Pro každý blok na vstupu na výstup vypište jeden řádek obsahující minimální cenu, za kterou lze přepravit náklad z místa <var>S</var> do místa <var>C</var>.</p>


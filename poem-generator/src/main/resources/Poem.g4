/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor
 */

grammar Poem;

poem:line line line line line;
line:(' '?noun|' '?preposition|' '?pronoun)(linebreak|EOF|' '?);
adjective:('black'|'white'|'dark'|'light'|'bright'|'murky'|'muddy'|'clear')((' '?noun|' '?adjective|linebreak|EOF|' '?));
noun:('heart'|'sun'|'moon'|'thunder'|'fire'|'time'|'wind'|'sea'|'river'|'flavor'|'wave'|'willow'|'rain'|'tree'|'flower'|'field'|'meadow'|'pasture'|'harvest'|'water'|'father'|'mother'|'brother'|'sister')' '?(verb|preposition|linebreak|EOF|' '?);
pronoun:('my'|'your'|'his'|'her')(' '?noun|' '?adjective);
verb:('runs'|'walks'|'stands'|'climbs'|'crawls'|'flows'|'flies'|'transcends'|'ascends'|'descends'|'sinks') (' '?preposition|' '?pronoun|linebreak|EOF|' '?);
preposition:('above'|'across'|'against'|'along'|'among'|'around'|'before'|'behind'|'beneath'|'beside'|'between'|'beyond'|'during'|'inside'|'onto'|'outside'|'under'|'underneath'|'upon'|'with'|'without'|'through') (' '?noun|' '?pronoun|' '?adjective);
linebreak:('\n'|'\r'|EOF|'\n\r'|'\r\n'|'\t'|' '?);

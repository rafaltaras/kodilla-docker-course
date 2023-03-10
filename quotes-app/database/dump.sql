CREATE SEQUENCE quotes_seq_gen START 1000 INCREMENT 1;

CREATE TABLE quotes (
    id        serial           PRIMARY KEY,
    author    VARCHAR (128),
    content   VARCHAR (1024)
);

INSERT INTO quotes VALUES (1, ' Pablo Picasso', 'Computers are useless.  They can only give you answers. ');
INSERT INTO quotes VALUES (2, ' Sam Ewing', 'Computers are like bikinis. They save people a lot of guesswork. ');
INSERT INTO quotes VALUES (3, ' Janet Reno', 'They have computers, and they may have other weapons of mass destruction. ');
INSERT INTO quotes VALUES (4, ' Paul Leary', 'That’s what’s cool about working with computers.  They don’t argue, they remember everything, and they don’t drink all your beer. ');
INSERT INTO quotes VALUES (5, ' Robert X. Cringely', 'If the automobile had followed the same development cycle as the computer, a Rolls-Royce would today cost $100, get a million miles per gallon, and explode once a year, killing everyone inside. ');
INSERT INTO quotes VALUES (6, ' Dave Barry', 'Computers are getting smarter all the time.  Scientists tell us that soon they will be able to talk to us.  (And by ‘they’, I mean ‘computers’.  I doubt scientists will ever be able to talk to us.) ');
INSERT INTO quotes VALUES (7, ' Larry DeLuca', 'I’ve noticed lately that the paranoid fear of computers becoming intelligent and taking over the world has almost entirely disappeared from the common culture.  Near as I can tell, this coincides with the release of MS-DOS. ');
INSERT INTO quotes VALUES (8, ' Edsger W. Dijkstra', 'The question of whether computers can think is like the question of whether submarines can swim. ');
INSERT INTO quotes VALUES (9, ' Marvin Minsky', 'It’s ridiculous to live 100 years and only be able to remember 30 million bytes.  You know, less than a compact disc.  The human condition is really becoming more obsolete every minute. ');
INSERT INTO quotes VALUES (10, ' C3PO', 'The city’s central computer told you?  R2D2, you know better than to trust a strange computer! ');
INSERT INTO quotes VALUES (11, ' Steve Wozniak', 'Never trust a computer you can’t throw out a window. ');
INSERT INTO quotes VALUES (12, ' Jeff Pesis', 'Hardware: The parts of a computer system that can be kicked. ');
INSERT INTO quotes VALUES (13, ' Alan Kay', 'Most software today is very much like an Egyptian pyramid with millions of bricks piled on top of each other, with no structural integrity, but just done by brute force and thousands of slaves. ');
INSERT INTO quotes VALUES (14, ' Dennie van Tassel', 'I’ve finally learned what ‘upward compatible’ means.  It means we get to keep all our old mistakes. ');
INSERT INTO quotes VALUES (15, ' Jeremy S. Anderson', 'There are two major products that come out of Berkeley: LSD and UNIX.  We don’t believe this to be a coincidence. ');
INSERT INTO quotes VALUES (16, ' End of the word according to Unix–2^32 seconds after January 1, 1970', '19 Jan 2038 at 3:14:07 AM ');
INSERT INTO quotes VALUES (17, ' Microsoft senior vice president Brian Valentine describing the state of the art in OS security, 2003', 'Every operating system out there is about equal… We all suck. ');
INSERT INTO quotes VALUES (18, ' Dave Barry', 'Microsoft has a new version out, Windows XP, which according to everybody is the ‘most reliable Windows ever.‘  To me, this is like saying that asparagus is ‘the most articulate vegetable ever.‘ ');
INSERT INTO quotes VALUES (19, ' Homer Simpson', 'The Internet?  Is that thing still around? ');
INSERT INTO quotes VALUES (20, ' Nytwind', 'The Web is like a dominatrix.  Everywhere I turn, I see little buttons ordering me to Submit. ');
INSERT INTO quotes VALUES (21, ' Blair Houghton', 'Come to think of it, there are already a million monkeys on a million typewriters, and Usenet is nothing like Shakespeare. ');
INSERT INTO quotes VALUES (22, ' Henry Petroski', 'The most amazing achievement of the computer software industry is its continuing cancellation of the steady and staggering gains made by the computer hardware industry. ');
INSERT INTO quotes VALUES (23, ' Timm Martin', 'True innovation often comes from the small startup who is lean enough to launch a market but lacks the heft to own it. ');
INSERT INTO quotes VALUES (24, ' Alan Cooper', 'It has been said that the great scientific disciplines are examples of giants standing on the shoulders of other giants.  It has also been said that the software industry is an example of midgets standing on the toes of other midgets. ');
INSERT INTO quotes VALUES (25, ' Lou Gerstner', 'It is not about bits, bytes and protocols, but profits, losses and margins. ');

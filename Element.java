// enumerated class for element constants

public enum Element {
    Hydrogen("1", "H", "1.007", "0", "1", "1", "1", "1", "gas", "no", "yes", "Nonmetal", "0.79", "2.2", "13.5984", "8.99E-05", "14.175", "20.28", "3", "Cavendish", "1766", "14.304", "1", "1"),
    Helium("2", "He", "4.002", "2", "2", "2", "1", "18", "gas", "no", "yes", "Noble Gas", "0.49", "no", "24.5874", "1.79E-04", "no", "4.22", "5", "Janssen", "1868", "5.193", "1", "2"),
    Lithium("3", "Li", "6.941", "4", "3", "3", "2", "1", "solid", "no", "yes", "Alkali Metal", "2.1", "0.98", "5.3917", "5.34E-01", "453.85", "1615", "5", "Arfvedson", "1817", "3.582", "2", "1"),
    Beryllium("4", "Be", "9.012", "5", "4", "4", "2", "2", "solid", "no", "yes", "Alkaline Earth Metal", "1.4", "1.57", "9.3227", "1.85E+00", "1560.15", "2742", "6", "Vaulquelin", "1798", "1.825", "2", "2"),
    Boron("5", "B", "10.811", "6", "5", "5", "2", "13", "solid", "no", "yes", "Metalloid", "1.2", "2.04", "8.298", "2.34E+00", "2573.15", "4200", "6", "Gay-Lussac", "1808", "1.026", "2", "3"),
    Carbon("6", "C", "12.011", "6", "6", "6", "2", "14", "solid", "no", "yes", "Nonmetal", "0.91", "2.55", "11.2603", "2.27E+00", "3948.15", "4300", "7", "Prehistoric", "no", "0.709", "2", "4"),
    Nitrogen("7", "N", "14.007", "7", "7", "7", "2", "15", "gas", "no", "yes", "Nonmetal", "0.75", "3.04", "14.5341", "1.25E-03", "63.29", "77.36", "8", "Rutherford", "1772", "1.04", "2", "5"),
    Oxygen("8", "O", "15.999", "8", "8", "8", "2", "16", "gas", "no", "yes", "Nonmetal", "0.65", "3.44", "13.6181", "1.43E-03", "50.5", "90.2", "8", "Priestley/Scheele", "1774", "0.918", "2", "6"),
    Fluorine("9", "F", "18.998", "10", "9", "9", "2", "17", "gas", "no", "yes", "Halogen", "0.57", "3.98", "17.4228", "1.70E-03", "53.63", "85.03", "6", "Moissan", "1886", "0.824", "2", "7"),
    Neon("10", "Ne", "20.18", "10", "10", "10", "2", "18", "gas", "no", "yes", "Noble Gas", "0.51", "no", "21.5645", "9.00E-04", "24.703", "27.07", "8", "Ramsay and Travers", "1898", "1.03", "2", "8"),
    Sodium("11", "Na", "22.99", "12", "11", "11", "3", "1", "solid", "no", "yes", "Alkali Metal", "2.2", "0.93", "5.1391", "9.71E-01", "371.15", "1156", "7", "Davy", "1807", "1.228", "3", "1"),
    Magnesium("12", "Mg", "24.305", "12", "12", "12", "3", "2", "solid", "no", "yes", "Alkaline Earth Metal", "1.7", "1.31", "7.6462", "1.74E+00", "923.15", "1363", "8", "Black", "1755", "1.023", "3", "2"),
    Aluminum("13", "Al", "26.982", "14", "13", "13", "3", "13", "solid", "no", "yes", "Metal", "1.8", "1.61", "5.9858", "2.70E+00", "933.4", "2792", "8", "Wshler", "1827", "0.897", "3", "3"),
    Silicon("14", "Si", "28.086", "14", "14", "14", "3", "14", "solid", "no", "yes", "Metalloid", "1.5", "1.9", "8.1517", "2.33E+00", "1683.15", "3538", "8", "Berzelius", "1824", "0.705", "3", "4"),
    Phosphorus("15", "P", "30.974", "16", "15", "15", "3", "15", "solid", "no", "yes", "Nonmetal", "1.2", "2.19", "10.4867", "1.82E+00", "317.25", "553", "7", "BranBrand", "1669", "0.769", "3", "5"),
    Sulfur("16", "S", "32.065", "16", "16", "16", "3", "16", "solid", "no", "yes", "Nonmetal", "1.1", "2.58", "10.36", "2.07E+00", "388.51", "717.8", "10", "Prehistoric", "no", "0.71", "3", "6"),
    Chlorine("17", "Cl", "35.453", "18", "17", "17", "3", "17", "gas", "no", "yes", "Halogen", "0.97", "3.16", "12.9676", "3.21E-03", "172.31", "239.11", "11", "Scheele", "1774", "0.479", "3", "7"),
    Argon("18", "Ar", "39.948", "22", "18", "18", "3", "18", "gas", "no", "yes", "Noble Gas", "0.88", "no", "15.7596", "1.78E-03", "83.96", "87.3", "8", "Rayleigh and Ramsay", "1894", "0.52", "3", "8"),
    Potassium("19", "K", "39.098", "20", "19", "19", "4", "1", "solid", "no", "yes", "Alkali Metal", "2.8", "0.82", "4.3407", "8.62E-01", "336.5", "1032", "10", "Davy", "1807", "0.757", "4", "1"),
    Calcium("20", "Ca", "40.078", "20", "20", "20", "4", "2", "solid", "no", "yes", "Alkaline Earth Metal", "2.2", "1", "6.1132", "1.54E+00", "1112.15", "1757", "14", "Davy", "1808", "0.647", "4", "2"),
    Scandium("21", "Sc", "44.956", "24", "21", "21", "4", "3", "solid", "no", "yes", "Transition Metal", "2.1", "1.36", "6.5615", "2.99E+00", "1812.15", "3109", "15", "Nilson", "1878", "0.568", "4", "no"),
    Titanium("22", "Ti", "47.867", "26", "22", "22", "4", "4", "solid", "no", "yes", "Transition Metal", "2", "1.54", "6.8281", "4.54E+00", "1933.15", "3560", "9", "Gregor", "1791", "0.523", "4", "no"),
    Vanadium("23", "V", "50.942", "28", "23", "23", "4", "5", "solid", "no", "yes", "Transition Metal", "1.9", "1.63", "6.7462", "6.11E+00", "2175.15", "3680", "9", "del Rio", "1801", "0.489", "4", "no"),
    Chromium("24", "Cr", "51.996", "28", "24", "24", "4", "6", "solid", "no", "yes", "Transition Metal", "1.9", "1.66", "6.7665", "7.15E+00", "2130.15", "2944", "9", "Vauquelin", "1797", "0.449", "4", "no"),
    Manganese("25", "Mn", "54.938", "30", "25", "25", "4", "7", "solid", "no", "yes", "Transition Metal", "1.8", "1.55", "7.434", "7.44E+00", "1519.15", "2334", "11", "Gahn, Scheele", "1774", "0.479", "4", "no"),
    Iron("26", "Fe", "55.845", "30", "26", "26", "4", "8", "solid", "no", "yes", "Transition Metal", "1.7", "1.83", "7.9024", "7.87E+00", "1808.15", "3134", "10", "Prehistoric", "no", "0.449", "4", "no"),
    Cobalt("27", "Co", "58.933", "32", "27", "27", "4", "9", "solid", "no", "yes", "Transition Metal", "1.7", "1.88", "7.881", "8.86E+00", "1768.15", "3200", "14", "Brandt", "1735", "0.421", "4", "no"),
    Nickel("28", "Ni", "58.693", "31", "28", "28", "4", "10", "solid", "no", "yes", "Transition Metal", "1.6", "1.91", "7.6398", "8.91E+00", "1726.15", "3186", "11", "Cronstedt", "1751", "0.444", "4", "no"),
    Copper("29", "Cu", "63.546", "35", "29", "29", "4", "11", "solid", "no", "yes", "Transition Metal", "1.6", "1.9", "7.7264", "8.96E+00", "1357.75", "2835", "11", "Prehistoric", "no", "0.385", "4", "no"),
    Zinc("30", "Zn", "65.38", "35", "30", "30", "4", "12", "solid", "no", "yes", "Transition Metal", "1.5", "1.65", "9.3942", "7.13E+00", "692.88", "1180", "15", "Prehistoric", "no", "0.388", "4", "no"),
    Gallium("31", "Ga", "69.723", "39", "31", "31", "4", "13", "solid", "no", "yes", "Metal", "1.8", "1.81", "5.9993", "5.91E+00", "302.91", "2477", "14", "de Boisbaudran", "1875", "0.371", "4", "3"),
    Germanium("32", "Ge", "72.64", "41", "32", "32", "4", "14", "solid", "no", "yes", "Metalloid", "1.5", "2.01", "7.8994", "5.32E+00", "1211.45", "3106", "17", "Winkler", "1886", "0.32", "4", "4"),
    Arsenic("33", "As", "74.922", "42", "33", "33", "4", "15", "solid", "no", "yes", "Metalloid", "1.3", "2.18", "9.7886", "5.78E+00", "1090.15", "887", "14", "Albertus Magnus", "1250", "0.329", "4", "5"),
    Selenium("34", "Se", "78.96", "45", "34", "34", "4", "16", "solid", "no", "yes", "Nonmetal", "1.2", "2.55", "9.7524", "4.81E+00", "494.15", "958", "20", "Berzelius", "1817", "0.321", "4", "6"),
    Bromine("35", "Br", "79.904", "45", "35", "35", "4", "17", "liq", "no", "yes", "Halogen", "1.1", "2.96", "11.8138", "3.12E+00", "266.05", "332", "19", "Balard", "1826", "0.474", "4", "7"),
    Krypton("36", "Kr", "83.798", "48", "36", "36", "4", "18", "gas", "no", "yes", "Noble Gas", "1", "no", "13.9996", "3.73E-03", "115.93", "119.93", "23", "Ramsay and Travers", "1898", "0.248", "4", "8"),
    Rubidium("37", "Rb", "85.468", "48", "37", "37", "5", "1", "solid", "no", "yes", "Alkali Metal", "3", "0.82", "4.1771", "1.53E+00", "312.79", "961", "20", "Bunsen and Kirchoff", "1861", "0.363", "5", "1"),
    Strontium("38", "Sr", "87.62", "50", "38", "38", "5", "2", "solid", "no", "yes", "Alkaline Earth Metal", "2.5", "0.95", "5.6949", "2.64E+00", "1042.15", "1655", "18", "Davy", "1808", "0.301", "5", "2"),
    Yttrium("39", "Y", "88.906", "50", "39", "39", "5", "3", "solid", "no", "yes", "Transition Metal", "2.3", "1.22", "6.2173", "4.47E+00", "1799.15", "3609", "21", "Gadolin", "1794", "0.298", "5", "no"),
    Zirconium("40", "Zr", "91.224", "51", "40", "40", "5", "4", "solid", "no", "yes", "Transition Metal", "2.2", "1.33", "6.6339", "6.51E+00", "2125.15", "4682", "20", "Klaproth", "1789", "0.278", "5", "no"),
    Niobium("41", "Nb", "92.906", "52", "41", "41", "5", "5", "solid", "no", "yes", "Transition Metal", "2.1", "1.6", "6.7589", "8.57E+00", "2741.15", "5017", "24", "Hatchett", "1801", "0.265", "5", "no"),
    Molybdenum("42", "Mo", "95.96", "54", "42", "42", "5", "6", "solid", "no", "yes", "Transition Metal", "2", "2.16", "7.0924", "1.02E+01", "2890.15", "4912", "20", "Scheele", "1778", "0.251", "5", "no"),
    Technetium("43", "Tc", "98", "55", "43", "43", "5", "7", "artificial", "yes", "no", "Transition Metal", "2", "1.9", "7.28", "1.15E+01", "2473.15", "5150", "23", "Perrier and Segre", "1937", "no", "5", "no"),
    Ruthenium("44", "Ru", "101.07", "57", "44", "44", "5", "8", "solid", "no", "yes", "Transition Metal", "1.9", "2.2", "7.3605", "1.24E+01", "2523.15", "4423", "16", "Klaus", "1844", "0.238", "5", "no"),
    Rhodium("45", "Rh", "102.906", "58", "45", "45", "5", "9", "solid", "no", "yes", "Transition Metal", "1.8", "2.28", "7.4589", "1.24E+01", "2239.15", "3968", "20", "Wollaston", "1803", "0.243", "5", "no"),
    Palladium("46", "Pd", "106.42", "60", "46", "46", "5", "10", "solid", "no", "yes", "Transition Metal", "1.8", "2.2", "8.3369", "1.20E+01", "1825.15", "3236", "21", "Wollaston", "1803", "0.244", "4", "no"),
    Silver("47", "Ag", "107.868", "61", "47", "47", "5", "11", "solid", "no", "yes", "Transition Metal", "1.8", "1.93", "7.5762", "1.05E+01", "1234.15", "2435", "27", "Prehistoric", "no", "0.235", "5", "no"),
    Cadmium("48", "Cd", "112.411", "64", "48", "48", "5", "12", "solid", "no", "yes", "Transition Metal", "1.7", "1.69", "8.9938", "8.69E+00", "594.33", "1040", "22", "Stromeyer", "1817", "0.232", "5", "no"),
    Indium("49", "In", "114.818", "66", "49", "49", "5", "13", "solid", "no", "yes", "Metal", "2", "1.78", "5.7864", "7.31E+00", "429.91", "2345", "34", "Reich and Richter", "1863", "0.233", "5", "3"),
    Tin("50", "Sn", "118.71", "69", "50", "50", "5", "14", "solid", "no", "yes", "Metal", "1.7", "1.96", "7.3439", "7.29E+00", "505.21", "2875", "28", "Prehistoric", "no", "0.228", "5", "4"),
    Antimony("51", "Sb", "121.76", "71", "51", "51", "5", "15", "solid", "no", "yes", "Metalloid", "1.5", "2.05", "8.6084", "6.69E+00", "904.05", "1860", "29", "Early historic times", "no", "0.207", "5", "5"),
    Tellurium("52", "Te", "127.6", "76", "52", "52", "5", "16", "solid", "no", "yes", "Metalloid", "1.4", "2.1", "9.0096", "6.23E+00", "722.8", "1261", "29", "von Reichenstein", "1782", "0.202", "5", "6"),
    Iodine("53", "I", "126.904", "74", "53", "53", "5", "17", "solid", "no", "yes", "Halogen", "1.3", "2.66", "10.4513", "4.93E+00", "386.65", "457.4", "24", "Courtois", "1811", "0.214", "5", "7"),
    Xenon("54", "Xe", "131.293", "77", "54", "54", "5", "18", "gas", "no", "yes", "Noble Gas", "1.2", "no", "12.1298", "5.89E-03", "161.45", "165.03", "31", "Ramsay and Travers", "1898", "0.158", "5", "8"),
    Cesium("55", "Cs", "132.905", "78", "55", "55", "6", "1", "solid", "no", "yes", "Alkali Metal", "3.3", "0.79", "3.8939", "1.87E+00", "301.7", "944", "22", "Bunsen and Kirchoff", "1860", "0.242", "6", "1"),
    Barium("56", "Ba", "137.327", "81", "56", "56", "6", "2", "solid", "no", "yes", "Alkaline Earth Metal", "2.8", "0.89", "5.2117", "3.59E+00", "1002.15", "2170", "25", "Davy", "1808", "0.204", "6", "2"),
    Lanthanum("57", "La", "138.905", "82", "57", "57", "6", "3", "solid", "no", "yes", "Lanthanide", "2.7", "1.1", "5.5769", "6.15E+00", "1193.15", "3737", "19", "Mosander", "1839", "0.195", "6", "no"),
    Cerium("58", "Ce", "140.116", "82", "58", "58", "6", "no", "solid", "no", "yes", "Lanthanide", "2.7", "1.12", "5.5387", "6.77E+00", "1071.15", "3716", "19", "Berzelius", "1803", "0.192", "6", "no"),
    Praseodymium("59", "Pr", "140.908", "82", "59", "59", "6", "no", "solid", "no", "yes", "Lanthanide", "2.7", "1.13", "5.473", "6.77E+00", "1204.15", "3793", "15", "von Welsbach", "1885", "0.193", "6", "no"),
    Neodymium("60", "Nd", "144.242", "84", "60", "60", "6", "no", "solid", "no", "yes", "Lanthanide", "2.6", "1.14", "5.525", "7.01E+00", "1289.15", "3347", "16", "von Welsbach", "1885", "0.19", "6", "no"),
    Promethium("61", "Pm", "145", "84", "61", "61", "6", "no", "artificial", "yes", "no", "Lanthanide", "2.6", "1.13", "5.582", "7.26E+00", "1204.15", "3273", "14", "Marinsky et al.", "1945", "no", "6", "no"),
    Samarium("62", "Sm", "150.36", "88", "62", "62", "6", "no", "solid", "no", "yes", "Lanthanide", "2.6", "1.17", "5.6437", "7.52E+00", "1345.15", "2067", "17", "Boisbaudran", "1879", "0.197", "6", "no"),
    Europium("63", "Eu", "151.964", "89", "63", "63", "6", "no", "solid", "no", "yes", "Lanthanide", "2.6", "1.2", "5.6704", "5.24E+00", "1095.15", "1802", "21", "Demarcay", "1901", "0.182", "6", "no"),
    Gadolinium("64", "Gd", "157.25", "93", "64", "64", "6", "no", "solid", "no", "yes", "Lanthanide", "2.5", "1.2", "6.1501", "7.90E+00", "1585.15", "3546", "17", "de Marignac", "1880", "0.236", "6", "no"),
    Terbium("65", "Tb", "158.925", "94", "65", "65", "6", "no", "solid", "no", "yes", "Lanthanide", "2.5", "1.2", "5.8638", "8.23E+00", "1630.15", "3503", "24", "Mosander", "1843", "0.182", "6", "no"),
    Dysprosium("66", "Dy", "162.5", "97", "66", "66", "6", "no", "solid", "no", "yes", "Lanthanide", "2.5", "1.22", "5.9389", "8.55E+00", "1680.15", "2840", "21", "de Boisbaudran", "1886", "0.17", "6", "no"),
    Holmium("67", "Ho", "164.93", "98", "67", "67", "6", "no", "solid", "no", "yes", "Lanthanide", "2.5", "1.23", "6.0215", "8.80E+00", "1743.15", "2993", "29", "Delafontaine and Soret", "1878", "0.165", "6", "no"),
    Erbium("68", "Er", "167.259", "99", "68", "68", "6", "no", "solid", "no", "yes", "Lanthanide", "2.5", "1.24", "6.1077", "9.07E+00", "1795.15", "3503", "16", "Mosander", "1843", "0.168", "6", "no"),
    Thulium("69", "Tm", "168.934", "100", "69", "69", "6", "no", "solid", "no", "yes", "Lanthanide", "2.4", "1.25", "6.1843", "9.32E+00", "1818.15", "2223", "18", "Cleve", "1879", "0.16", "6", "no"),
    Ytterbium("70", "Yb", "173.054", "103", "70", "70", "6", "no", "solid", "no", "yes", "Lanthanide", "2.4", "1.1", "6.2542", "6.97E+00", "1097.15", "1469", "16", "Marignac", "1878", "0.155", "6", "no"),
    Lutetium("71", "Lu", "174.967", "104", "71", "71", "6", "no", "solid", "no", "yes", "Lanthanide", "2.3", "1.27", "5.4259", "9.84E+00", "1936.15", "3675", "22", "Urbain/ von Welsbach", "1907", "0.154", "6", "no"),
    Hafnium("72", "Hf", "178.49", "106", "72", "72", "6", "4", "solid", "no", "yes", "Transition Metal", "2.2", "1.3", "6.8251", "1.33E+01", "2500.15", "4876", "17", "Coster and von Hevesy", "1923", "0.144", "6", "no"),
    Tantalum("73", "Ta", "180.948", "108", "73", "73", "6", "5", "solid", "no", "yes", "Transition Metal", "2.1", "1.5", "7.5496", "1.67E+01", "3269.15", "5731", "19", "Ekeberg", "1801", "0.14", "6", "no"),
    Wolfram("74", "W", "183.84", "110", "74", "74", "6", "6", "solid", "no", "yes", "Transition Metal", "2", "2.36", "7.864", "1.93E+01", "3680.15", "5828", "22", "J. and F. d'Elhuyar", "1783", "0.132", "6", "no"),
    Rhenium("75", "Re", "186.207", "111", "75", "75", "6", "7", "solid", "no", "yes", "Transition Metal", "2", "1.9", "7.8335", "2.10E+01", "3453.15", "5869", "21", "Noddack, Berg, and Tacke", "1925", "0.137" , "6", "no"),
    Osmium("76", "Os", "190.23", "114", "76", "76", "6", "8", "solid", "no", "yes", "Transition Metal", "1.9", "2.2", "8.4382", "2.26E+01", "3300.15", "5285", "19", "Tennant", "1803", "0.13", "6", "no"),
    Iridium("77", "Ir", "192.217", "115", "77", "77", "6", "9", "solid", "no", "yes", "Transition Metal", "1.9", "2.2", "8.967", "2.26E+01", "2716.15", "4701", "25", "Tennant", "1804", "0.131", "6", "no"),
    Platinum("78", "Pt", "195.084", "117", "78", "78", "6", "10", "solid", "no", "yes", "Transition Metal", "1.8", "2.28", "8.9587", "2.15E+01", "2045.15", "4098", "32", "Ulloa/Wood", "1735", "0.133", "6", "no"),
    Gold("79", "Au", "196.967", "118", "79", "79", "6", "11", "solid", "no", "yes", "Transition Metal", "1.8", "2.54", "9.2255", "1.93E+01", "1337.73", "3129", "21", "Prehistoric", "no", "0.129", "6", "no"),
    Mercury("80", "Hg", "200.59", "121", "80", "80", "6", "12", "liq", "no", "yes", "Transition Metal", "1.8", "2", "10.4375", "1.35E+01", "234.43", "630", "26", "Prehistoric", "no", "0.14", "6", "no"),
    Thallium("81", "Tl", "204.383", "123", "81", "81", "6", "13", "solid", "no", "yes", "Metal", "2.1", "2.04", "6.1082", "1.19E+01", "577.15", "1746", "28", "Crookes", "1861", "0.129", "6", "3"),
    Lead("82", "Pb", "207.2", "125", "82", "82", "6", "14", "solid", "no", "yes", "Metal", "1.8", "2.33", "7.4167", "1.13E+01", "600.75", "2022", "29", "Prehistoric", "no", "0.129", "6", "4"),
    Bismuth("83", "Bi", "208.98", "126", "83", "83", "6", "15", "solid", "no", "yes", "Metal", "1.6", "2.02", "7.2856", "9.81E+00", "544.67", "1837", "19", "Geoffroy the Younger", "1753", "0.122", "6", "5"),
    Polonium("84", "Po", "210", "126", "84", "84", "6", "16", "solid", "yes", "yes", "Metal", "1.5", "2", "8.417", "9.32E+00", "527.15", "1235", "34", "Curie", "1898", "no", "6", "6"),
    Astatine("85", "At", "210", "125", "85", "85", "6", "17", "solid", "yes", "yes", "Metalloid", "1.4", "2.2", "9.3", "7.00E+00", "575.15", "610", "21", "Corson et al.", "1940", "no", "6", "7"),
    Radon("86", "Rn", "222", "136", "86", "86", "6", "18", "gas", "yes", "yes", "Noble Gas", "1.3", "no", "10.7485", "9.73E-03", "202.15", "211.3", "20", "Dorn", "1900", "0.094", "6", "8"),
    Francium("87", "Fr", "223", "136", "87", "87", "7", "1", "solid", "yes", "yes", "Alkali Metal", "no", "0.7", "4.0727", "1.87E+00", "300.15", "950", "21", "Perey", "1939", "no", "7", "1"),
    Radium("88", "Ra", "226", "138", "88", "88", "7", "2", "solid", "yes", "yes", "Alkaline Earth Metal", "no", "0.9", "5.2784", "5.50E+00", "973.15", "2010", "15", "Pierre and Marie Curie", "1898", "no", "7", "2"),
    Actinium("89", "Ac", "227", "138", "89", "89", "7", "3", "solid", "yes", "yes", "Actinide", "no", "1.1", "5.17", "1.01E+01", "1323.15", "3471", "11", "Debierne/Giesel", "1899", "0.12", "7", "no"),
    Thorium("90", "Th", "232.038", "142", "90", "90", "7", "no", "solid", "yes", "yes", "Actinide", "no", "1.3", "6.3067", "1.17E+01", "2028.15", "5061", "12", "Berzelius", "1828", "0.113", "7", "no"),
    Protactinium("91", "Pa", "231.036", "140", "91", "91", "7", "no", "solid", "yes", "yes", "Actinide", "no", "1.5", "5.89", "1.54E+01", "1873.15", "4300", "14", "Hahn and Meitner", "1917", "no", "7", "no"),
    Uranium("92", "U", "238.029", "146", "92", "92", "7", "no", "solid", "yes", "yes", "Actinide", "no", "1.38", "6.1941", "1.90E+01", "1405.15", "4404", "15", "Peligot", "1841", "0.116", "7", "no"),
    Neptunium("93", "Np", "237", "144", "93", "93", "7", "no", "artificial", "yes", "no", "Actinide", "no", "1.36", "6.2657", "2.05E+01", "913.15", "4273", "153", "McMillan and Abelson", "1940", "no", "7", "no"),
    Plutonium("94", "Pu", "244", "150", "94", "94", "7", "no", "artificial", "yes", "no", "Actinide", "no", "1.28", "6.0262", "1.98E+01", "913.15", "3501", "163", "Seaborg et al.", "1940", "no", "7", "no"),
    Americium("95", "Am", "243", "148", "95", "95", "7", "no", "artificial", "yes", "no", "Actinide", "no", "1.3", "5.9738", "1.37E+01", "1267.15", "2880", "133", "Seaborg et al.", "1944", "no", "7", "no"),
    Curium("96", "Cm", "247", "151", "96", "96", "7", "no", "artificial", "yes", "no", "Actinide", "no", "1.3", "5.9915", "1.35E+01", "1340.15", "3383", "133", "Seaborg et al.", "1944", "no", "7", "no"),
    Berkelium("97", "Bk", "247", "150", "97", "97", "7", "no", "artificial", "yes", "no", "Actinide", "no", "1.3", "6.1979", "1.48E+01", "1259.15", "983", "83", "Seaborg et al.", "1949", "no", "7", "no"),
    Californium("98", "Cf", "251", "153", "98", "98", "7", "no", "artificial", "yes", "no", "Actinide", "no", "1.3", "6.2817", "1.51E+01", "1925.15", "1173", "123", "Seaborg et al.", "1950", "no", "7", "no"),
    Einsteinium("99", "Es", "252", "153", "99", "99", "7", "no", "artificial", "yes", "no", "Actinide", "no", "1.3", "6.42", "1.35E+01", "1133.15", "no", "123", "Ghiorso et al.", "1952", "no", "7", "no"),
    Fermium("100", "Fm", "257", "157", "100", "100", "7", "no", "artificial", "yes", "no", "Actinide", "no", "1.3", "6.5", "no", "no", "no", "103", "Ghiorso et al.", "1953", "no", "7", "no"),
    Mendelevium("101", "Md", "258", "157", "101", "101", "7", "no", "artificial", "yes", "no", "Actinide", "no", "1.3", "6.58", "no", "no", "no", "33", "Ghiorso et al.", "1955", "no", "7", "no"),
    Nobelium("102", "No", "259", "157", "102", "102", "7", "no", "artificial", "yes", "no", "Actinide", "no", "1.3", "6.65", "no", "no", "no", "73", "Ghiorso et al.", "1958", "no", "7", "no"),
    Lawrencium("103", "Lr", "262", "159", "103", "103", "7", "no", "artificial", "yes", "no", "Actinide", "no", "no", "no", "no", "no", "no", "203", "Ghiorso et al.", "1961", "no", "7", "no"),
    Rutherfordium("104", "Rf", "261", "157", "104", "104", "7", "4", "artificial", "yes", "no", "Transition Metal", "no", "no", "no", "1.81E+01", "no", "no", "no", "Ghiorso et al.", "1969", "no", "7", "no"),
    Dubnium("105", "Db", "262", "157", "105", "105", "7", "5", "artificial", "yes", "no", "Transition Metal", "no", "no", "no", "3.90E+01", "no", "no", "no", "Ghiorso et al.", "1970", "no", "7", "no"),
    Seaborgium("106", "Sg", "266", "160", "106", "106", "7", "6", "artificial", "yes", "no", "Transition Metal", "no", "no", "no", "3.50E+01", "no", "no", "no", "Ghiorso et al.", "1974", "no", "7", "no"),
    Bohrium("107", "Bh", "264", "157", "107", "107", "7", "7", "artificial", "yes", "no", "Transition Metal", "no", "no", "no", "3.70E+01", "no", "no", "no", "Armbruster and Monzenberg", "1981", "no", "7", "no"),
    Hassium("108", "Hs", "267", "159", "108", "108", "7", "8", "artificial", "yes", "no", "Transition Metal", "no", "no", "no", "4.10E+01", "no", "no", "no", "Armbruster and Monzenberg", "1983", "no", "7", "no"),
    Meitnerium("109", "Mt", "268", "159", "109", "109", "7", "9", "artificial", "yes", "no", "Unknown", "no", "no", "no", "3.50E+01", "no", "no", "no", "GSI, Darmstadt, West Germany", "1982", "no", "7", "no"),
    Darmstadtium("110", "Ds", "271", "161", "110", "110", "7", "10", "artificial", "yes", "no", "Unknown", "no", "no", "no", "no", "no", "no", "no", "no", "1994", "no", "7", "no"),
    Roentgenium("111", "Rg", "272", "161", "111", "111", "7", "11", "artificial", "yes", "no", "Unknown", "no", "no", "no", "no", "no", "no", "no", "no", "1994", "no", "7", "no"),
    Copernicium("112", "Cn", "285", "173", "112", "112", "7", "12", "artificial", "yes", "no", "Unknown", "no", "no", "no", "no", "no", "no", "no", "no", "1996", "no", "7", "no"),
    Nihonium("113", "Nh", "284", "171", "113", "113", "7", "13", "artificial", "yes", "no", "Unknown", "no", "no", "no", "no", "no", "no", "no", "no", "2004", "no", "7", "3"),
    Flerovium("114", "Fl", "289", "175", "114", "114", "7", "14", "artificial", "yes", "no", "Unknown", "no", "no", "no", "no", "no", "no", "no", "no", "1999", "no", "7", "4"),  
    Moscovium("115", "Mc", "288", "173", "115", "115", "7", "15", "artificial", "yes", "no", "Unknown", "no", "no", "no", "no", "no", "no", "no", "no", "2010", "no", "7", "5"),
    Livermorium("116", "Lv", "292", "176", "116", "116", "7", "16", "artificial", "yes", "no", "Unknown", "no", "no", "no", "no", "no", "no", "no", "no", "2000", "no", "7", "6"),
    Tennessine("117", "Ts", "295", "178", "117", "117", "7", "17", "artificial", "yes", "no", "Unknown", "no", "no", "no", "no", "no", "no", "no", "no", "2010", "no", "7", "7"),
    Oganesson("118", "Og", "294", "176", "118", "118", "7", "18", "artificial", "yes", "no", "Unknown", "no", "no", "no", "no", "no", "no", "no", "no", "2006", "no", "7", "8");
    
    private int atomicNum;
    private String symbol;
    private String mass;
    private String neutronNum;
    private String protonNum;
    private String electronNum;
    private int period;
    private int group;
    private String phase;
    private boolean radioactive;
    private boolean natural;
    private String type;
    private String radius;
    private String eNeg;
    private String firstIE;
    private String density;
    private String melting;
    private String boiling;
    private String numIsotopes;
    private String discoverer;
    private String year;
    private String specHeat;
    private String numShells;
    private String numVal;
 
    private Element(String atomicNum, String symbol, String mass, String neutronNum, String protonNum, String electronNum, String period, 
            String group, String phase, String radioactive, String natural, String type, String radius, String eNeg, String firstIE, String density, 
            String melting, String boiling, String numIsotopes, String discoverer, String year, String specHeat, String numShells, String numVal){
        if(!atomicNum.equals("no")){this.atomicNum = Integer.parseInt(atomicNum);} else {this.atomicNum = -1;};
        this.symbol = symbol;
        this.mass = mass;
        this.neutronNum = neutronNum;
        this.protonNum = protonNum;
        this.electronNum = electronNum;
        if(!period.equals("no")){this.period = Integer.parseInt(period);} else {this.period = -1;};
        if(!group.equals("no")){this.group = Integer.parseInt(group);} else {this.group = -1;};
        this.phase = phase;
        this.radioactive = radioactive.equals("yes");
        this.natural = natural.equals("yes");
        this.type = type;
        this.radius = radius;
        this.eNeg = eNeg;
        this.firstIE = firstIE;
        this.density = density;
        this.melting = melting;
        this.boiling = boiling;
        this.numIsotopes = numIsotopes;
        this.discoverer = discoverer;
        this.year = year;
        this.specHeat = specHeat;
        this.numShells = numShells;
        this.numVal = numVal;
    }

    public int getAtomicNum() {
        return atomicNum;
    }
    public String getSymbol() {
        return symbol;
    }
    public String getMass() {
        return mass;
    }
    public String getNeutronNum() {
        return neutronNum;
    }
    public String getProtonNum() {
        return protonNum;
    }
    public String getElectronNum() {
        return electronNum;
    }
    public int getPeriod() {
        return period;
    }
    public int getGroup() {
        return group;
    }
    public String getPhase() {
        return phase;
    }
    public boolean getRadioactive(){
        return radioactive;
    }
    public boolean getNatural(){
        return natural;
    }
    public String getType() {
        return type;
    }
    public String getRadius() {
        return radius;
    }
    public String getENeg() {
        return eNeg;
    }
    public String getFirstIE() {
        return firstIE;
    }
    public String getDensity() {
        return density;
    }
    public String getMelting() {
        return melting;
    }
    public String getBoiling() {
        return boiling;
    }
    public String getNumIsotopes() {
        return numIsotopes;
    }
    public String getDiscoverer() {
        return discoverer;
    }
    public String getYear() {
        return year;
    }
    public String getSpecHeat() {
        return specHeat;
    }
    public String getNumShells() {
        return numShells;
    }
    public String getNumVal() {
        return numVal;
    }
}
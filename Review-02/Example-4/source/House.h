#ifndef HOUSE_H_INCLUDED
#define HOUSE_H_INCLUDED

#include <iostream>
#include <string>
#include <list>

#include "Room.h"

/**
 * A House is composed of zero or more Room objects.
 * <p>
 * This class serves as our demonstration of the STL
 * iterator interface.
 */
class House{
    public:
        /**
         * A standard C++ STL style iterator.
         * <p>
         * Recall the rules on Class naming and the STL.
         */
         typedef std::list<Room>::iterator iterator;

        /**
         * A standard C++ STL style iterator.
         * <p>
         * Recall the rules on Class naming and the STL.
         */
         typedef std::list<Room>::const_iterator const_iterator;

    private:
        /**
         * Name of the house--e.g.,
         * Minecraft Beach House
         */
        std::string name;

        /**
         * Container of Rooms
         */
        std::list<Room> rooms;

    public:
        /**
         * Construct a House with a
         * generic name and no rooms.
         */
        House();

        /**
         * Construct a House with a specified name
         */
        House(std::string name);

        /**
         * Add a Room
         *
         * @param toAdd new Room object
         */
        void addRoom(Room toAdd);

        /**
         * Allow access to the _beginning_ of the
         * house--i.e., Room container--via an
         * iterator.
         */
        iterator begin();

        /**
         * Allow access to the _beginning_ of the
         * house--i.e., Room container--via a
         * const_iterator.
         */
        const_iterator begin() const;

        /**
         * Allow access to the _end_ of the
         * house--i.e., Room container--via an
         * iterator.
         */
        iterator end();

        /**
         * Allow access to the _end_ of the
         * house--i.e., Room container--via a
         * const_iterator.
         */
        const_iterator end() const;

        /**
         * Return the size of the house--i.e.,
         * the number of rooms
         */
        size_t size() const;

        /**
         * Print the house
         */
        void display(std::ostream& outs) const;

};

/**
 * House Stream Insertion (Output) Operator
 *
 * This is often written as a wrapper for a
 * display or print function.
 * <p>
 * This operator can *NOT* be implemented as a member function.
 */
inline
std::ostream& operator<<(std::ostream &outs, const House &prt)
{
    prt.display(outs);

    return outs;
}


#endif
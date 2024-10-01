# Iterator Pattern

## Overview
The Iterator Pattern provides a way to access elements of a collection sequentially without exposing its underlying representation. This implementation demonstrates a playlist management system.

## Classes

### Song
- **Attributes:**
  - `title`: The title of the song.
  - `artist`: The artist of the song.
- **Methods:**
  - `getTitle()`: Returns the title of the song.
  - `getArtist()`: Returns the artist of the song.
  - `toString()`: Returns a string representation of the song.

### Playlist
- **Attributes:**
  - `songs`: A list that holds the `Song` objects.
- **Methods:**
  - `addSong(Song song)`: Adds a song to the playlist.
  - `iterator()`: Returns an iterator for the playlist.

### SongIterator
- **Attributes:**
  - `index`: Tracks the current index for iteration.
- **Methods:**
  - `hasNext()`: Checks if there are more songs to iterate.
  - `next()`: Returns the next song in the playlist.

## Usage
The `Main` class demonstrates the creation of a playlist, adding songs, and iterating through them to display each song's details.

